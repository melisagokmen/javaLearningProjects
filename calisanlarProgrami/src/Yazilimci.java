
public class Yazilimci extends Calisan{
private String diller;
    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller=diller;
    }
   public void formatAt(String isletimSistemi){
       System.out.println(getAd()+isletimSistemi+"ni yüklüyor");
   }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("yazilimcinin bildigi diller" + diller);
    }
}
