package ArrayandArraylist;
import java.util.Arrays;
import java.util.Random;

public class DescendingSort {
  public static void main(String[]args){
    Random rd=new Random();
    int[] arr=new int[5];
    for(int i=0;i<arr.length;i++){
        arr[i]=rd.nextInt(30);
    }
    System.out.println("Before Sorting:"+Arrays.toString(arr));
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }


        }
        
    }
    System.out.println("After Sorting"+Arrays.toString(arr));
  }
    
}
