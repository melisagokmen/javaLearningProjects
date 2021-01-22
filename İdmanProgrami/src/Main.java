
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args){
        System.out.println("İdman Programına Hoşgeldiniz...");
        Scanner scanner = new Scanner(System.in);
        String idmanlar="Burpee\n"+"Pushup\n"+"Situp\n"+"Squat";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun\n");
        System.out.println("Burpee sayısı ");
        int burpee=scanner.nextInt();
        System.out.println("Pushup sayısı ");
        int pushup=scanner.nextInt();
        System.out.println("Situp sayısı ");
        int situp=scanner.nextInt();
        System.out.println("Squat sayısı ");
        int squat=scanner.nextInt();
        scanner.nextLine();
        İdman idman =new İdman(burpee, pushup, situp, squat);
        int i=1;
        try(FileWriter writer=new FileWriter("log.txt")) {
            writer.write("İdman Programı\n");
            writer.write("Burpee sayısı: "+idman.getBurpet_sayisi()+"\n");
            writer.write("Pushup sayısı: "+idman.getPushup_sayisi()+"\n");
            writer.write("Situp sayısı: "+idman.getSitup_sayisi()+"\n");
            writer.write("Squat sayısı: "+idman.getSquat_sayisi()+"\n");
           
        
        while(idman.idmanBittiMi()==false){
            System.out.println("Hareket türünü giriniz(Burpee,Pushup,Situp,Squat)");
            String tur=scanner.nextLine();
            System.out.println("Hareketten kac adet yapılacak? ");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
            writer.write(i+". işlem -----> Hareket: "+tur+"Sayı"+sayi+"\n");
            i++;
        }
    }   catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
}
