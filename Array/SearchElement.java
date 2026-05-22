package Array;
import java.util.*;
public class SearchElement {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Enter element you want to search");
        int d=scn.nextInt();
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                idx=i;
            }
        }
        if(idx==-1){
            System.out.println("Element is not found");

        }
        else{
        System.out.println("Element is found at " + (idx+1) + " position");
        }
    }

}
