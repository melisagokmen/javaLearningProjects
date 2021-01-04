
package nothesaplama;

import java.util.Scanner;

public class NotHesaplama {

  
    public static void main(String[] args) {
      Scanner scanner= new Scanner(System.in);
      int vize1= scanner.nextInt();
      int vize2= scanner.nextInt();
      int vize3=scanner.nextInt();
      double not= (vize1*3/10.0)+(vize2*3/10.0)+(vize3*4/10.0);
      if(not>90){
          System.out.println("AA aldiniz");
      }
      else if(not>85&&not<90){
          System.out.println("BA aldiniz");
      }
      else if(not>80&&not<85){
          System.out.println("BB aldiniz");
      }
       else if(not>75&&not<80){
          System.out.println("CB aldiniz");
      }
       else if(not>70&&not<75){
          System.out.println("CC aldiniz");
      }
       else if(not>65&&not<70){
          System.out.println("DC aldiniz");
      }
      else if(not>65&&not<70){
          System.out.println("DD aldiniz");
      }
      else if(not<65){
          System.out.println("FF aldiniz");
      }
    }
    
}
