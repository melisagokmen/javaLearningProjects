
package priorityqueueexample;

import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueExample {

   
    public static void main(String[] args) {
        Queue<Hasta>acilservis =new PriorityQueue<Hasta>();
        acilservis.offer(new Hasta("Murat Bey","yanık"));
        acilservis.offer(new Hasta("Okan Bey","baş ağrısı"));
        acilservis.offer(new Hasta("Elif Hanım","apandist"));
        acilservis.offer(new Hasta("Oğuz Bey","yanık"));
        acilservis.offer(new Hasta("Merve Hanım","yanık"));
        acilservis.offer(new Hasta("Gizem Hanım","apandist"));

        int i=1;
        while (acilservis.isEmpty()!=true) {
            System.out.println("*********************");
            System.out.println(i+". sırada");
            System.out.println(acilservis.poll());
            System.out.println("*********************");
            i++;
        }
    }
    
}
