package Stack;
import java.util.*;
import java.io.*;
public class NextElementGreaterToRight1 {
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
    public static int[] solve(int[]arr){
        int[] nge=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0&&arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
}
}
