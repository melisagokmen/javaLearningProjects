public class Ucgen extends Sekil{
    private int a;
    private int b;
    private int c;

    @Override
    public void alanHesapla() {
       double u=(a+b+c)/2.0;
       double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(getIsim()+" alanı "+alan);
    }

    public Ucgen(int a, int b, int c, String isim) {
        super(isim);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
}
