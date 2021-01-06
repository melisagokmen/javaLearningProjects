package innerclassproject;

public class Problem {
    public static class Matematik{
        public static void daire_alani(int yaricap){
            System.out.println("Dairenin alani: "+(Math.PI*yaricap*yaricap));
        }
        public static void ucgen_cevresi(int kenar1,int kenar2,int kenar3){
            System.out.println("Üçgenin çevresi: "+(kenar1+kenar2+kenar3));
            
        }
    }
    public static class Fizik{
        public static void icCarpim(Vec vector1,Vec vector2){
            int iccarpim=(vector1.getI()*vector2.getI())+(vector1.getJ()*vector2.getJ())+(vector1.getK()*vector2.getK());
            System.out.println(vector1.getIsim()+" ile "+vector2.getIsim()+" vektörlerinin iç çarpımı: "+iccarpim);
        }
    }
}
