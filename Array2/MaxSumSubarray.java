package Array2;
import java.util.*;

public class MaxSumSubarray {
    public static void main(String[] args){
       int[] arr={100,200,50,0,200,20,10};
       int N=arr.length;
       int k=3;
       int sum=0;
       int maxsum=0;
       for(int i=0;i<k;i++){
        sum+=arr[i];
       }
       maxsum=sum;
       for(int i=1;i<N-k+1;i++){
        int prevElement=arr[i-1];
        int nextElement=arr[i+k-1];
        sum=sum+nextElement-prevElement;
        maxsum=Math.max(maxsum,sum);
     }
       System.out.println(maxsum);
    }
}
