package Array;
import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int c=max-min;
        System.out.println("Span of array"+c);

    }
    
}
