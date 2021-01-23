
import java.io.Serializable;

public class Kart implements Serializable{
    private char deger;
    private boolean tahmin=false;

    public char getDeger() {
        return deger;
    }

    public boolean isTahmin() {
        return tahmin;
    }

    public void setDeger(char deger) {
        this.deger = deger;
    }

    public void setTahmin(boolean tahmin) {
        this.tahmin = tahmin;
    }

    public Kart(char deger) {
        this.deger = deger;
    }
    
}
