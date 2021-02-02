
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;

public class Connections {

    private String user_name = "root";
    private String password = "";
    private String db_name = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection con = null;

    private Statement statement = null;
    
    private PreparedStatement preparedStatement=null;
   
    public void preparedGetEmployee(int id){
        try {
            String query="Select * from employees where id>? and name like ?";
            preparedStatement =con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, "Y%");
            ResultSet rs= preparedStatement.executeQuery();
            
            while(rs.next()){
                String name=rs.getString("name");
                String surname=rs.getString("surname");
                String email=rs.getString("email");
                System.out.println("Name:"+name+" "+"Surname: "+surname+" "+"Email: "+email);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addEmployee() {
        try {

            statement = con.createStatement();
            String name = "Semih";
            String surname = "Aktaş";
            String email = "semihaktas@gmail.com";

            String query = "Insert Into employees (name,surname,email) VALUES(" + "'" + name + "'," + "'" + surname + "'," + "'" + email + "')";
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void removeEmployee(){
        try {
            statement=con.createStatement();
            String query="Delete from employees where id>3";
            int count=statement.executeUpdate(query);
            System.out.println(count+" data has been affected");
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void updateEmployee() {
        try {
            statement = con.createStatement();
            String query = "Update employees Set email='mustafamuratcoskun@gmail.com' where id=1";
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getEmployee() {
        String query = "Select * from employees";
        try {

            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String email = rs.getString("email");

                System.out.println("Id: " + id + "\n" + "Name: " + name + "\n" + "Surname: " + surname + "\n" + "Email: " + email + "\n");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Connections() {
        try {
            String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name + "?useUnicode=true&characterEncoding=utf8";
            try {
                Class.forName("com.mysql.jdbc.Driver");

            } catch (ClassNotFoundException ex) {
                System.out.println("Driver not found...");
            }
            con = (Connection) DriverManager.getConnection(url, user_name, password);
            System.out.println("Connection successful...");
        } catch (SQLException ex) {
            System.out.println("Connection unsuccessful...");

        }
    }

    public static void main(String[] args) {

        Connections connections = new Connections();
        /*
        System.out.println("Before remove");
        System.out.println("*************************");
        connections.getEmployee();

        System.out.println("After remove");
        System.out.println("*************************");
        connections.removeEmployee();
        connections.getEmployee();*/
        connections.preparedGetEmployee(1);
        

    }
}
