package Stack;
import java.util.*;
import java.io.*;

public class NextElementGreaterToRight2 {
    public static void display(int[]a){
        StringBuilder sb=new StringBuilder();
        for(int val:a){
            sb.append(val+"\n");
        }
        System.out.println("Resultant array is\n"+sb);
    }
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array");
        int n=Integer.parseInt(br.readLine());
        int[] a=new int[n];
        System.out.println("Enter elements in array");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        int [] nge=solve(a);
        display(nge);
    }
    public static int[] solve(int[] arr){
        int[] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(st.size()>0&&arr[i]>arr[st.peek()]){
                int pos=st.peek();
                nge[pos]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0){
            int pos=st.peek();
            nge[pos]=-1;
            st.pop();
        }
        return nge;

    }
    
}
