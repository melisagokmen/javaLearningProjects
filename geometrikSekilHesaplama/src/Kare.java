public class Kare extends Sekil{
private int kenar;

    public Kare(int kenar, String isim) {
        super(isim);
        this.kenar = kenar;
    } 
    public void alanHesapla(){
        System.out.println(getIsim()+" alanı "+(kenar*kenar));
    }
}
