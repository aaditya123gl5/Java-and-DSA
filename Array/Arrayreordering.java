package Array;
import java.util.*;

public class Arrayreordering {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int j=0;
        int[] c=new int[n];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                 c[j]=arr[i];
                 j++;
        }
     
    }
    System.out.println(Arrays.toString(c));
    
}
}
