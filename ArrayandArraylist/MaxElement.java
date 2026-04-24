package ArrayandArraylist;
import java.util.*;
public class MaxElement {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++){
          arr[i]=scn.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        
    }
    
}
