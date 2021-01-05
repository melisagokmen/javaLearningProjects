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
           System.out.println(sartlar);
            System.out.println("-----------------------------------------");
           Yolcu yolcu=new Yolcu();
           System.out.println("Harç bedeli kontrol ediliyor...");
            System.out.println("------------------------------------------");
           Thread.sleep(3000);
           if(yolcu.yurtdisiHarciKontrol()==false){
               System.out.println(message);
               continue;
           }
           System.out.println("Siyasi yasak kontrol ediliyot...");
           Thread.sleep(3000);
           if(yolcu.siyasiYasakKontrol()==false){
               System.out.println(message);
               continue;
           }
           System.out.println("Vize durumu kontrol ediliyor...");
           Thread.sleep(3000);
           if(yolcu.vizeDurumuKontrol()==false){
               System.out.println(message);
               continue;
           }
           System.out.println("Yurtdışına çıkabilirsiniz...");
           break;
           
       }
}
 
}
