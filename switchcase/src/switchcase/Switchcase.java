
package switchcase;

import java.util.Scanner;


public class Switchcase {

  
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String islemler="1.Toplama islemi\n"+
                    "2.Cikarma islemi\n"+
                    "3.Carpma islemi\n"+
                    "4.Bolme islemi";
        System.out.println(islemler);
        String islem= scanner.nextLine();
        int a;
        int b;
        switch(islem){
            case "1":
                    System.out.println("birinci sayi:");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayi:");
                    b = scanner.nextInt();
                    System.out.println("toplam:"+ (a+b));
                    break;
             case "2":
                    System.out.println("birinci sayi:");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayi:");
                    b = scanner.nextInt();
                    System.out.println("toplam:"+ (a-b));
                    break;
             case "3":
                    System.out.println("birinci sayi:");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayi:");
                    b = scanner.nextInt();
                    System.out.println("toplam:"+ (a*b));
                    break;
             case "4":
                    System.out.println("birinci sayi:");
                    a = scanner.nextInt();
                    System.out.println("ikinci sayi:");
                    b = scanner.nextInt();
                    System.out.println("toplam:"+ (a/b));
                    break;
            default: System.out.println("gecersiz islem");
        }
    }
    
}
