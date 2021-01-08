import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        System.out.println("LYS YGS Birinci Bulma Programı... ");
        Scanner scanner=new Scanner(System.in);
        String islemler="İslemler...\n"+"1.Eşit Ağırlık Öğrencileri Birincisi\n"+"2.Sayısal Öğrencileri Birincisi\n";
        System.out.println(islemler);
        
        while(true){
                System.out.print("Çıkış için q ya basın...\n");
                String cevap=scanner.nextLine();
                if(cevap.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            //Birinci öğrencinin bilgileri
                System.out.println("Birinci öğrencinin ismini giriniz...");
                String isim1=scanner.nextLine();
                System.out.println("Öğrencinin netlerini giriniz(Türkçe,Matematik,Edebiyat,Fizik şeklinde)");
                int turkce1=scanner.nextInt();
                int mat1=scanner.nextInt();
                int edb1=scanner.nextInt();
                int fizik1=scanner.nextInt();
                scanner.nextLine();
            //İkinci öğrencinin bilgileri
                System.out.println("İkinci öğrencinin ismini giriniz...");
                String isim2=scanner.nextLine();
                System.out.println("Öğrencinin netlerini giriniz(Türkçe,Matematik,Edebiyat,Fizik şeklinde)");
                int turkce2=scanner.nextInt();
                int mat2=scanner.nextInt();
                int edb2=scanner.nextInt();
                int fizik2=scanner.nextInt();
                scanner.nextLine();
            //Üçüncü öğrencinin bilgileri
                System.out.println("Üçüncü öğrencinin ismini giriniz...");
                String isim3=scanner.nextLine();
                System.out.println("Öğrencinin netlerini giriniz(Türkçe,Matematik,Edebiyat,Fizik şeklinde)");
                int turkce3=scanner.nextInt();
                int mat3=scanner.nextInt();
                int edb3=scanner.nextInt();
                int fizik3=scanner.nextInt();
                scanner.nextLine();
            System.out.println("Bir işlem giriniz...");
            String islem=scanner.nextLine();
           
            if(islem.equals("1")){
                EsitAgirlik ogrenci1=new EsitAgirlik(turkce1, mat1, edb1, fizik1, isim1);
                EsitAgirlik ogrenci2=new EsitAgirlik(turkce2, mat2, edb2, fizik2, isim2);
                EsitAgirlik ogrenci3=new EsitAgirlik(turkce3, mat3, edb3, fizik3, isim3);
                EsitAgirlik birinci= birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci eşit ağırlık öğrencisi "+birinci.getIsim());
                System.out.println("Öğrencinin puanı:"+birinci.puanHesapla());
                
            }
            else if(islem.equals("2")){
                Sayisal ogrenci1=new Sayisal(turkce1, mat1, edb1, fizik1, isim1);
                Sayisal ogrenci2=new Sayisal(turkce2, mat2, edb2, fizik2, isim2);
                Sayisal ogrenci3=new Sayisal(turkce3, mat3, edb3, fizik3, isim3);
                Sayisal birinci=birinci(ogrenci1, ogrenci2, ogrenci3);
                System.out.println("Birinci sayısal öğrencisi "+birinci.getIsim());
                System.out.println("Öğrencinin puanı:"+birinci.puanHesapla());
                        
                
            }
            else System.out.println("Geçerli bir işlem giriniz...");
        }
    }
    public static <E extends Aday> E birinci(E e1,E e2,E e3){
        if(e1.puanHesapla()>e2.puanHesapla()&& e1.puanHesapla()>e3.puanHesapla()){
            return e1;
        }
        else if(e2.puanHesapla()>e1.puanHesapla()&& e2.puanHesapla()>e3.puanHesapla()){
            return e2;
        }
        else if(e3.puanHesapla()>e1.puanHesapla()&& e3.puanHesapla()>e2.puanHesapla()){
            return e3;
        }
        else return e1;
    }
    
}

