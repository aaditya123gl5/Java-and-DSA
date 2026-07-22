package Array;
import java.io.*;
import java.util.Arrays;

public class InverseOfArray {
    public static void main(String[]args)throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    System.out.println(Arrays.toString(inverse(a)));
    }
    public static int[] inverse(int[]a){
        int[] inv=new int[a.length];
        for(int i=0;i<a.length;i++){
            int v=a[i];
            inv[v]=i;
        }
        return inv;
       
    }

    
}
