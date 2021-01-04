
package asalbulma;


public class AsalBulma {
    
    public static boolean asalMi(int sayi){
        
    for(int i=2;i<sayi;i++){
        if(sayi%i==0){
            return false;
        }
         }
    return true;
    }
    public static void main(String[] args) {
     for(int b=2;b<100;b++){
         if(asalMi(b)){
             System.out.println(b); 
         }
     }
    
    }
    
}
