
package mp3kopyalama;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mp3Kopyalama {
    private static ArrayList<Integer> icerik=new ArrayList<Integer>();
    public static void dosyaOku(){
        try {
            FileInputStream in =new FileInputStream("sarki.mp3");
            
            int oku;
            while((oku=in.read()) !=-1 ){
                icerik.add(oku);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void kopyala(String dosyaismi){
        try {
            FileOutputStream out= new FileOutputStream(dosyaismi);
            for(int deger: icerik){
                out.write(deger);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Mp3Kopyalama.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void main(String[] args) {
        dosyaOku();
        long baslangic=System.currentTimeMillis();
        kopyala("sarki2.mp3");
        long bitis=System.currentTimeMillis();
        System.out.println("Dosyanın koplayalanması "+((bitis-baslangic)/1000)+" saniye sürdü");
    }
    
}
