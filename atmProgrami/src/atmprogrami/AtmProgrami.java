
package atmprogrami;

import java.util.Scanner;


public class AtmProgrami {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int bakiye = 1000;
       String islemler="1.Bakiye kontrolu"+"2.Para Cekme"+"3.Para Yatirma"+"Cikis icin q";
        System.out.println(islemler);
       String islem= scanner.nextLine();
       while(true){
           if(islem.equals("q")){
               break;
           }
           else if(islem.equals("1")){
               System.out.println(bakiye);
               
           }
           else if(islem.equals("2")){
               System.out.println("kac tl cekmek istersiniz");
               int a=scanner.nextInt();
               scanner.nextLine();
               bakiye=bakiye-a;
               
           }
           else if(islem.equals("3")){
               int b=scanner.nextInt();
               bakiye=bakiye+b;
             
               
           }
           else System.out.println("gecersiz islem");
       }
       
        
       
       
    }
    
}
