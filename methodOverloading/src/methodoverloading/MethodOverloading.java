
package methodoverloading;

import java.util.Scanner;

public class MethodOverloading {
public static void hesapMakinesi(int a,int b){
    System.out.println("toplama icin 1,cikarma icin 2,carpma icin 3, bolme icin 4 seciniz");
    Scanner scanner= new Scanner(System.in);
    int sayi= scanner.nextInt();
    if(sayi==1){
        System.out.println(a+b);
    }
    if(sayi==2){
        System.out.println(a-b);
    }
    if(sayi==3){
        System.out.println(a*b);
    }
    if(sayi==4){
        System.out.println(a/b);
    }
    
}



public static void hesapMakinesi(int a,int b,int c){

 System.out.println("toplama icin 1,cikarma icin 2,carpma icin 3, bolme icin 4 seciniz");
    Scanner scanner= new Scanner(System.in);
    int sayi= scanner.nextInt();
    if(sayi==1){
        System.out.println(a+b+c);
    }
    if(sayi==2){
        System.out.println(a-b-c);
    }
    if(sayi==3){
        System.out.println(a*b*c);
    }
    if(sayi==4){
        System.out.println(a/b/c);
    }
}

    public static void main(String[] args) {
        hesapMakinesi(6, 5,2);
    }
    
}
