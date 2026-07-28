package Array;
import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] num1=new int[n1];
        for(int i=0;i<n1;i++){
            num1[i]=scn.nextInt();
        }
        int n2=scn.nextInt();
        int[] num2=new int[n2];
        for(int j=0;j<n2;j++){
            num2[j]=scn.nextInt();
        }
        int[] res=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<num1.length&&j<num2.length){
            if(num1[i]<num2[j]){
                res[k]=num1[i];
                i++;
                k++;
            }
            else{
                res[k]=num2[j];
                j++;
                k++;
            }
        }
        while(i<num1.length){
            res[k]=num1[i];
            i++;
            k++;
        }
        while(j<num2.length){
            res[k]=num2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(res));

    }
    
}
