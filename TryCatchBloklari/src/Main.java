
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void mekanKontrol(int yas) throws IOException{
        if(yas<18){
            //checked exception oldugunda throws anahtar kelimesinin kullanilmasi gerek
            throw new IOException();
        }
        else{
            System.out.println("Mekana hoşgeldiniz...");
        }
    }
 public static void main(String[] args) throws IOException {
  
       Scanner scanner=new Scanner(System.in);
       System.out.println("Lütfen yaşınızı giriniz...");
       int yas=scanner.nextInt();
       mekanKontrol(yas);
       
        /*try {
            mekanKontrol(yas);
        }
        catch (IOException ex) {
            System.out.println("IO Exception oluştu...");
        }*/
       
       
       
       
 
   
  
}
   
}
