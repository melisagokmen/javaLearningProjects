
import java.util.Scanner;


public class Test {
    private static Sarkicilar sarkicilar=new Sarkicilar();
    private static Scanner scanner=new Scanner(System.in);
    public static void islemleri_bastir(){
        System.out.print("0.İslemleri Goruntule\n" +"1.Sarkicilari Goruntule\n"+"2.Sarkici Ekle\n"+"3.Sarkici Guncelle\n"+"4.Sarkici Sil\n"+"5.Sarkici Ara\n"+"6.Uygulamadan cik\n");
    }
    public static void goruntule(){
        sarkicilar.sarkicilaribastir();
    }
    public static void sarkici_ekle(){
        System.out.println("eklemek istediginiz saekicinin adini griniz");
        String isim=scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle() {
        System.out.println("guncellemek istediginiz pozisyon");
        int pozisyon=scanner.nextInt();
        scanner.nextLine();
        String yeni_isim=scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
        
    }
    public static void sil(){
        System.out.println("silmek istediginiz pozisyon");
        int pozisyon=scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    public static void ara() {
        System.out.println("aramak istediğiniz sarkici");
        String isim=scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }
    public static void main(String[] args) {
        System.out.println("sarkici uygulamasina hosgeldiniz...");
        islemleri_bastir();
        boolean cikis=false;
        int islem;
        while(!cikis){
            System.out.println("islem seciniz...");
            islem=scanner.nextInt();
            scanner.nextLine();
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("Uygulamadan cikiliyor...");
                    break;
            }
        }
    }
  
}
