package ArrayandArraylist;
import java.util.*;

public class LargestElement {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number of elements of array");
        int n=scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max)
                max=arr[i];
            }
            System.out.println(max);
        }

}
    
