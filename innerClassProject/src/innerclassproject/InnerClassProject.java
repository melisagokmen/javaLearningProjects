
package innerclassproject;

import java.util.Scanner;


public class InnerClassProject {

    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Matematik ve Fizik problemleri programına hoşgeldiniz...");
        String islemler="İşlemler\n"+"1.Daire Alanı Hesaplama\n"+"2.Üçgenin Çevresini Hesaplama\n"+"3.İki Vektörün İç Çarpımını Hesaplama\n"+"Çıkış için q ya basınız\n";
        while (true) {
            System.out.println(islemler);
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Yarıçap giriniz...");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daire_alani(yaricap);
                
            }
            else if(islem.equals("2")){
                System.out.println("Üçgenin kenarlarını giriniz...");
                int kenar1=scanner.nextInt();
                int kenar2=scanner.nextInt();
                int kenar3=scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.ucgen_cevresi(kenar1, kenar2, kenar3);
            }
            else if(islem.equals("3")){
                Vec vector1=new Vec("vector1");
                Vec vector2=new Vec("vector2");
                Problem.Fizik.icCarpim(vector1, vector2);
                
            }
            else System.out.println("Geçersiz işlem girdiniz...");
            
        }
    }
    
}
