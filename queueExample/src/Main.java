
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    
 public static void main(String[] args) throws InterruptedException {
   
    Queue<String> ekmek_kuyrugu=new LinkedList<String>();
     Random random=new Random();
     ekmek_kuyrugu.offer("Murat");
     ekmek_kuyrugu.offer("Hasan");
     ekmek_kuyrugu.offer("Okan");
     ekmek_kuyrugu.offer("Ayşe");
     ekmek_kuyrugu.offer("Merve");
     ekmek_kuyrugu.offer("Ezgi");
     ekmek_kuyrugu.offer("Gizem");
     ekmek_kuyrugu.offer("Mehmet");
     ekmek_kuyrugu.offer("Oğuz");
     ekmek_kuyrugu.offer("Azer");
     int ekmek_sayisi= 1+random.nextInt(10);
     System.out.println("Ekmek Sayısı: "+ekmek_sayisi);
     Thread.sleep(3000);
     while(ekmek_sayisi!=0){
         System.out.println(ekmek_kuyrugu.poll()+" ekmeği aldı");   
         ekmek_sayisi--;
         Thread.sleep(1000);
     }
     System.out.println("Ekmek kalmadı...");
}
}
