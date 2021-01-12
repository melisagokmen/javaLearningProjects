public class StaticClass {
    public static int obje_sayisi=0;//değişken sadece 1 defa oluşmuş oldu
     private static String isim;//isim değişkenini static yaparsak getIsim() den erişebiliriz
    public StaticClass(String isim) {
        obje_sayisi++;
        this.isim=isim;
       
    }
    public static String getIsim(){
        return isim;//statik olandan statik olmayanı kullanamıyoruz
    }
    
}
