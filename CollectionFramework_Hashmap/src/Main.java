import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
       HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "Php");
        hashMap.put(20, "Php");
        hashMap.put(20, "Php");//Cikan sonucta bir fark olmaz
        hashMap.put(50, "Javascript");
       /*
        
        System.out.println(hashMap);
        System.out.println(hashMap.get(50));
        System.out.println(hashMap.get(100));*/
       for(Map.Entry<Integer,String> entry: hashMap.entrySet()){
        System.out.println("Anahtar: "+entry.getKey()+" Değer: "+entry.getValue());
       }
    }
}
