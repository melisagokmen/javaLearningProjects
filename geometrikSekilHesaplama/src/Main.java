
import java.util.Scanner;
public class Main {
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    String islemler="1.Kare Alan Hesapla\n"+"2.Üçgen Alan Hesapla\n"+"3.Daire Alan Hesapla\n"+"Çıkış için q ya basınız\n";
    while (true) {
        System.out.println(islemler);
        System.out.println("Hangi şeklin alanını hesaplamak istiyorsunuz? ");
        String sekil_turu=scanner.nextLine();
        Sekil sekil=null;
        if(sekil_turu.equals("q")){
            System.out.println("Çıkış yapılıyor...");
            break;
        }
        else if(sekil_turu.equals("1")){
            System.out.print("Karenin kenarı: ");
            int kenar=scanner.nextInt();
            scanner.nextLine();
            sekil=new Kare(kenar,"Kare1");
            sekil.alanHesapla();
        }
        else if(sekil_turu.equals("2")){
            System.out.print("Üçgenin kenarı: ");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            scanner.nextLine();
            sekil=new Ucgen(a, b, c, "Üçgen1");
            sekil.alanHesapla();
        }
        else if(sekil_turu.equals("3")){
            System.out.println("Dairenin yarıçapı: ");
            int yaricap = scanner.nextInt();
            scanner.nextLine();
            sekil=new Daire(yaricap,"Daire1");
            sekil.alanHesapla();
        }
        else System.out.println("Geçersiz işlem...");
    }
}

    
}
