
import java.util.Scanner;


public class Atm {
    public void calis(  Hesap hesap){
    Login login=new Login();
    Scanner scanner=new Scanner(System.in);
        System.out.println("kullanıcı girişi");
        int giris_hakki=3;
        while(true){
            if(login.login(hesap)){
                System.out.println("giriş başarılı");
                break;
            }
            else {System.out.println("giriş başarısız");
            giris_hakki-=1;
                System.out.println("kalan giriş hakkınız:"+giris_hakki);
            }
            if(giris_hakki==0){
                System.out.println("giriş hakkınız kalmamıştır");
                return;
            }
        }
        String islemler="1.Bakiye goruntule\n"+"2.Para Yatirma"+"3.Para Cekme"+"4.Cikis icin q ";
        System.out.println(islemler);
        while(true){
            System.out.println("islemi seciniz");
            String islem=scanner.nextLine();
            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("hesap bakiyeniz:"+hesap.getBakiye());
            }
            else if(islem.equals("2")){
                int tutar= scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
               
            }
            else if(islem.equals("3")){
               int tutar=scanner.nextInt();
               scanner.nextLine();
               hesap.paraCek(tutar);
               
                System.out.println("hesap bakiyeniz:"+hesap.getBakiye());
            }
        }
    }
}
