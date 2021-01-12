package setmain;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

   
    public static void main(String[] args) {
      /* Set<String> set1=new HashSet<String>();
       Set<String> set2=new LinkedHashSet<String>();
       Set<String> set3=new TreeSet<String>();
       //System.out.println(set1.isEmpty());
        
       //HashSet icin
       set1.add("Java");
       set1.add("Python");
       set1.add("C++");
       set1.add("Javascript");
       set1.add("Php");
       
       //LinkedHashSet icin
       set2.add("Java");
       set2.add("Python");
       set2.add("C++");
       set2.add("Javascript");
       set2.add("Php");
       
       //TreeSet icin
       set3.add("Java");
       set3.add("Python");
       set3.add("C++");
       set3.add("Javascript");
       set3.add("Php");
       set3.add("Php");
       
       //set1.remove("Java");
       //Bir elemani sadece bir defa depolar
       
        System.out.println("HashSet ");
        for(String s:set1){
            System.out.println(s);
        }
        System.out.println("--------------------------------------");
        System.out.println("LinkedHashSet ");
        for(String s:set2){
            System.out.println(s);
        }
        System.out.println("--------------------------------------");

        System.out.println("TreeSet ");//Alfabetik olarak sıralar
        for(String s:set3){
            System.out.println(s);
        }
        System.out.println(set1.contains("Go"));
        System.out.println(set1.contains("Java"));
       */
      Set<String> set1= new HashSet<String>();
      Set<String> set2= new HashSet<String>();
      set1.add("Java");
      set1.add("C++");
      set1.add("Python");
      set1.add("Javascript");
      set1.add("Php");
      
      set2.add("Go");
      set2.add("Java");
      set2.add("CSS");
      
     /* Set<String> fark= new HashSet<String>(set2);
        System.out.println(fark.removeAll(set1));
        System.out.println(fark);
      */
     Set<String> kesisim= new HashSet<String>(set2);
        System.out.println(kesisim.retainAll(set1));
        System.out.println(kesisim);
      
       
    }
    
    
}
