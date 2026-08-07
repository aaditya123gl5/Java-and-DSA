package ArrayList;
import java.util.*;


public class IteratingOverJCF {
     public static void main(String[] args) {
      
        // Create an ArrayList and add some elements
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");

        Iterator<String> it = al.iterator();

        while (it.hasNext()) {

          String n = it.next(); 
            System.out.println(n);      
        }

    
    }
}
