package JCF;
import java.util.*;

public class SetMethods {
    public static void main(String[] args) {
    //Set<Integer> set=new Hashset();
    Set<Integer> set=new LinkedHashSet<>();
    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    Set<Integer> set1=new HashSet<>();
    set1.add(1);
    set1.add(2);
    System.out.println(set.size());
   
    /*Intersection of two set
    set.retainAll(set1);  
    System.out.println(set);*/

    /*Union of two set
    set.addAll(set1);
    System.out.println(set); */
    
   /*Iterator<Integer> it=set.iterator();
   while(it.hasNext()){
    System.out.println(it.next());
   }*/
   //coverion to Array
   Object[] obj=set.toArray();
   // Immutable list
   //set.removeAll(List.of(10,20));
   String str=set.toString();
   System.out.println(str);
   }
}
