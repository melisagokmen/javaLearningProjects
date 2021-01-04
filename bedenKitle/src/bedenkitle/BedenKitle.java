
package bedenkitle;

import java.util.Scanner;

public class BedenKitle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("kilonuzu girin");
        int kilo=scanner.nextInt();
        System.out.println("boyunuzu girin");
        double boy=scanner.nextDouble();
        double bki=kilo/(boy*boy);
        System.out.println("beden kitle indeksiniz: "+ bki);
    }
    
}
