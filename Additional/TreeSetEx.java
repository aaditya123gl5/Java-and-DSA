package Additional;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
    TreeSet<Integer> ts =new TreeSet<>();
    ts.add(1);
    ts.add(5);
    ts.add(6);
    //ts.add(9);
    //ts.add(18);
    TreeSet<Integer> ts1= new TreeSet<>();
    ts1.add(10);
    ts1.add(11);
    ts1.add(20);
    ts1.addAll(ts);
    System.out.println(ts1);
    Integer lessthan7=ts.lower(7);
    System.out.println(lessthan7);
    }
    

}
