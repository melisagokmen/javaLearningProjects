
package degerdegistime;

import java.util.Scanner;

public class DegerDegistime {

   
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int birinci_sayi= scanner.nextInt();
       int ikinci_sayi= scanner.nextInt();
       int temp;
      temp=birinci_sayi;
      birinci_sayi=ikinci_sayi;
      ikinci_sayi=temp;
        System.out.println(birinci_sayi);
        System.out.println(ikinci_sayi);
        
       
    }
    
}
