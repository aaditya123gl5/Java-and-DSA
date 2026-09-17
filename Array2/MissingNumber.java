package Array2;
import java.util.*;

public class MissingNumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(int word:arr){
            set.add(word);
        }
        for(int i=1;i<=n+1;i++){
            if(!set.contains(i)){
               System.out.println(i);
               break;
            }
        }
    }
}
