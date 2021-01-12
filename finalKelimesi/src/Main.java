public class Main { 
    public static void main(String[] args) {
        FinalTest f1=new FinalTest("Obje 1");
        FinalTest f2=new FinalTest("Obje 2");
        
        System.out.println("Obje sayisi: "+ f1.obje_sayisi);
        System.out.println("Obje sayisi: "+ f2.obje_sayisi);
        
        System.out.println("Database ismi: "+ Database.databaseIsmi);
        System.out.println("Database kullanıcı adı :"+ Database.userName);
        System.out.println("Database şifresi: "+ Database.password);
    }
    
}