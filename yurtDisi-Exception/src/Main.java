
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
   public static void main(String[] args) throws InterruptedException {
       System.out.println("Sabiha Gökcen Havaalanına Hoşgeldiniz...\n");
       System.out.println("-----------------------------------------");
       String sartlar="Yurtdışı Çıkış Kuralları...\n"
               +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
               + "15 tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
               +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";


       String message="Şartlardan hepsini sağlamanız gerekiyor...";
       while(true){
           System.out.println("-----------------------------------------");

           System.out.println(sartlar);
           System.out.println("-----------------------------------------");
           Yolcu yolcu=new Yolcu();
           System.out.println("Harç bedeli kontrol ediliyor...");
           Thread.sleep(3000);
         
           try {
             yolcu.yurtdisiHarciKontrol();
           } catch (HarcException ex) {
             ex.printStackTrace();
             continue;
           }
            System.out.println("------------------------------------------");
           
           System.out.println("Siyasi yasak kontrol ediliyor...");
           Thread.sleep(3000);
           
           try {
               yolcu.siyasiYasakKontrol();
           } catch (SiyasiException ex) {
              ex.printStackTrace();
              continue;
           }
           
            System.out.println("------------------------------------------");

           System.out.println("Vize durumu kontrol ediliyor...");
           Thread.sleep(3000);
           try {
               yolcu.vizeDurumuKontrol();
           } catch (VizeException ex) {
               ex.printStackTrace();
               continue;
           }
           System.out.println("------------------------------------------");

           System.out.println("Yurtdışına çıkabilirsiniz...");
           break;
           
       }
}
 
}
