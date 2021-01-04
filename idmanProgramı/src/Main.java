
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String idmanlar="Burpee\n"+"Pushup\n"+"Situp\n"+"Squat";
        System.out.println(idmanlar);
        System.out.println("bir idman olusturun");
        System.out.println("burpee sayisi ");
        int burpee=scanner.nextInt();
        System.out.println("pushup sayisi ");
        int pushup=scanner.nextInt();
        System.out.println("situp sayisi ");
        int situp=scanner.nextInt();
        System.out.println("squat sayisi ");
        int squat=scanner.nextInt();
        scanner.nextLine();
        İdman idman =new İdman(burpee, pushup, situp, squat);
        while(idman.idmanBittiMi()==false){
            System.out.println("hareket türü giriniz");
            String tur=scanner.nextLine();
            System.out.println("hareketten kac adet yapilacak");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
        }
    }
}
