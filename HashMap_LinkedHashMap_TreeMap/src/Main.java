import com.sun.java.accessibility.util.EventID;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Main {
   public static void mapYazdir(Map<Integer,String> map){
       map.put(10, "C++");
       map.put(5, "Java");
       map.put(1, "Python");
       map.put(2, "Php");
       map.put(100, "C");
       /*for (Map.Entry<Integer, String> entry : map.entrySet()) {
           System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());    
       }*/
      /*  for(Integer key:map.keySet()){
           System.out.println("Key: "+key+" Value: "+map.get(key));
      }*/
       Collection<String> values=map.values();
       for(String s:values){
           System.out.println("Değer: "+s);
       }
   }
   public static void main(String[] args) {
   Map<Integer,String> hashMap=new HashMap<Integer, String>();
   Map<Integer,String> linkedhashMap=new LinkedHashMap<Integer, String>();
   Map<Integer,String> treeMap=new TreeMap<Integer, String>();
       System.out.println("--------HashMap----------");
       mapYazdir(hashMap);//sirasiz
       System.out.println("------LinkedHashMap------");
       mapYazdir(linkedhashMap);//eklendigi siraya gore
       System.out.println("---------TreeMap---------");
       mapYazdir(treeMap);//key sirasina gore
}
}
