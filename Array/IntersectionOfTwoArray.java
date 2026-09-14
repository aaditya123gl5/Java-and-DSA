package Array;
import java.util.*;

public class IntersectionOfTwoArray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int[] arr1={1,2,3,4,5,5,6};
        int[] arr2={4,5,6,7,7,8};
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int word:arr1){
            set1.add(word);
        }
        for(int word3:arr2){
            set2.add(word3);
        }
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
