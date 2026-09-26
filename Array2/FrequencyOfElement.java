package Array2;
import java.util.*;

public class FrequencyOfElement {
    public static void main(String[] args){
        int[] arr={3,7,8,11,4,3,3,11,4,8};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int word:arr){
           map.put(word,map.getOrDefault(word,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int count=entry.getValue();
            int element=entry.getKey();
            System.out.println("Element= " +element + " : "+ " Count= " + count);
        }
    }
}
