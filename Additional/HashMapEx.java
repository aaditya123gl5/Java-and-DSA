package Additional;
import java.util.*;

public class HashMapEx {
    public static void main(String[] args){
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("aadi",124);
        hs.put("ram",353);
        hs.put("Shyam",321);
        System.out.println(hs.getOrDefault("aadi",124));

    }
    
}
