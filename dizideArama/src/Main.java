
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int bayrak=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("boyut giriniz...");
        int boyut=scanner.nextInt();
        System.out.println("bir sayi giriniz");
        int sayi=scanner.nextInt();
        int[] array=new int[boyut];

        for(int i=1;i<boyut;i++){
            Random r=new Random();
            array[i]=r.nextInt(sayi*2);
        }

        for(int i=0;i<boyut;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println("\n");
       for(int j=0;j<boyut;j++){
           for(int k=j;k<boyut;k++){
               if(array[j]+array[k]==sayi){
                   System.out.print(array[j]+" ile " +array[k]);
                   bayrak=1;
                   break;
               }

           }

       }
       if(bayrak==1){
               System.out.println(" var");

           }
           else System.out.println("icinde yok");

    }

}
