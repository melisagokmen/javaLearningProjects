
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
    public static void islemleri_bastir(){
        System.out.print("0.İşlemleri Görüntüle...\n"+"1.Bir Sonraki Şehre Git...\n"+"2.Bir Önceki Şehre Git...\n"+"3.Uygulamadan Çık...\n");
    }
    public static void sehirleri_turla(LinkedList<String> sehirler){
        ListIterator<String> iterator= sehirler.listIterator();
        int islem;
        islemleri_bastir();
        Scanner scanner=new Scanner(System.in);
        if(!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunamıyor...");
            
        }
        boolean cikis=false;
        boolean ileri=true;
        while(!cikis){
            System.out.println("Bir işlem seçiniz...");
            islem=scanner.nextInt();
            if(islem==0){
                islemleri_bastir();
            }
            else if(islem==1){
                if(!ileri){
                    if(iterator.hasNext()){
                        iterator.next();
                    }
                    ileri=true;
                }
                if(iterator.hasNext()){
                    System.out.println(iterator.next()+" şehrine gidiliyor...");
                    
                    
                }
                else System.out.println("Gidilecek şehir kalmadı...");
            }
            else if(islem==2){
                if(ileri){
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                    ileri=false;
                }
                if(iterator.hasPrevious()){
                    System.out.println(iterator.previous() +" şehrine gidiliyor...");
                    
                }
                else System.out.println("Şehir turu başladı... ");
            }
            else if(islem==3){
                System.out.println("Çıkış yapılıyor...");
                break;
            }
            else{ System.out.println("Geçerli bir sayı giriniz...");
            ileri=true;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<String> sehirler=new LinkedList<String>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Afyon");
        sehirleri_turla(sehirler);
        
        
    }
  
}
