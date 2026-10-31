package Additional;
import java.util.*;

public class ValidAngram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hs1=new HashMap<>();
        HashMap<Character,Integer> hs2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            hs1.put(s1,hs1.getOrDefault(s1,0)+1);
            hs2.put( t1,hs2.getOrDefault(t1,0)+1);

        } 
        return hs1.equals(hs2);
    }
}
    
