package paketekleme.paket2;
import paketekleme.paket1.*;

public class At extends Hayvan{
    
    public At(String isim) {
        super(isim);
    }
    public void isminiSoyle(){
        System.out.println(super.isim);//farklı paketteki classtan extend ettigimiz zaman protected ile erişim sağlayabiliriz
        
    }
}
