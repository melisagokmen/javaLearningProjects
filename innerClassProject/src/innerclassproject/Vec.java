
package innerclassproject;

import java.util.Scanner;

public class Vec {

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setK(int k) {
        this.k = k;
    }

    public String getIsim() {
        return isim;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }
    private String isim;
    private int i;
    private int j;
    private int k;

    public Vec(String isim) {
        this.isim = isim;
        Scanner scanner=new Scanner(System.in);
        System.out.println(isim+ "Vektörünün i,j ve k değerlerini girin");
        this.i = scanner.nextInt() ;
        this.j =scanner.nextInt();
        this.k = scanner.nextInt();

    }
    
}
