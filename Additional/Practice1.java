package Additional;
import java.util.*;

public class Practice1 {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Dhoni");
        map.put(2,"Rohit");
        map.put(3,"Virat");
        map.put(4,"Bumrah");

        //System.out.println(map.getOrDefault(5,"Don't exist"));
        //map.put(1,"Sachin");
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            Integer key=entry.getKey();
            String val=entry.getValue();
        }
    }
}
