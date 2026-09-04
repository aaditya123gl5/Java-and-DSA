package JCF;
import java.util.*;

public class Iterable {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
                                //new LinkedList<>();
                                //new Hashset
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        Iterator<Integer> it =  c.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
