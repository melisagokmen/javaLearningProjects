
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hoşgeldiniz");
        String islemler = "1.Yazilimci islemleri\n"+"2.Yönetici işlemleri\n"+"Çıkış için q";
        System.out.println(islemler);
        while(true){
            System.out.println("işlemi seçiniz");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci= new Yazilimci("Melisa", "Gokmen", 1, "C,Java");
                String yazilimciİslem="1.Format at\n"+ "2.Bilgileri Göster\n"+"3.Çıkış için q";
                System.out.println(yazilimciİslem);
                while (true) {                    
                    System.out.println("işlemi seçiniz");
                    String yİslem=scanner.nextLine();
                    if(yİslem.equals("q")){
                        break;
                    }
                    else if(yİslem.equals("1")){
                        System.out.println("işletim sistemi:");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if(yİslem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else System.out.println("geçersiz yazılımcı işlemi");
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici=new Yonetici("Onur", "Erdaş", 0, 1);
                String yoneticiİslem="1.Zam Yap\n"+"2.Bilgileri göster\n"+"Çıkış için q";
                System.out.println(yoneticiİslem);
                  while (true) {                    
                    System.out.println("işlemi seçiniz");
                    String yonİslem=scanner.nextLine();
                    if(yonİslem.equals("q")){
                        break;
                    }
                    else if(yonİslem.equals("1")){
                        System.out.println("zam miktari giriniz");
                        int zam=scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam);
                     
                    }
                    else if(yonİslem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else System.out.println("geçersiz yönetici işlemi");
                }
                
            }
            
        }
    }
}
