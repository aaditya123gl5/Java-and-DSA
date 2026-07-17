package Stack;
import java.util.*;
import java.io.*;

public class MergeOverlappingInterval {
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n][2];
        for(int j=0;j<n;j++){
            String line=br.readLine();
            String[] part=line.split(" ");  // " " -> to split string at space
            arr[j][0]=Integer.parseInt(part[0]);  /*Stores them as an interval in 2-D array*/
            arr[j][1]=Integer.parseInt(part[1]);
        }
        mergeInterval(arr);

    }
    public static void mergeInterval(int[][] arr){
        Pair[] p=new Pair[arr.length];
        for(int i=0;i<arr.length;i++){
            p[i]=new Pair(arr[i][0],arr[i][1]);
        }
        Arrays.sort(p);
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<p.length;i++){
            if(i==0){
                st.push(p[i]);
            }
            else{
                Pair top=st.peek();
                if(p[i].st>top.et){
                    st.push(p[i]);
                }
                else{
                    top.et=Math.max(top.et,p[i].et);
                }
            }
        }
        Stack<Pair> rs=new Stack<>();
        while(st.size()>0){
            rs.push(st.pop());
        }
        while(rs.size()>0){
            Pair p1=rs.pop();
            System.out.println(p1.st + " " + p1.et);
        }
    }
    public static class Pair implements Comparable<Pair>{
        int et; //End time
        int st; //Start time
        Pair(int st,int et){
            this.st=st;
            this.et=et;
        }
        //this>other return +ve
        //this=other return 0
        //this<other return -ve
        public int compareTo(Pair other){
            if(this.st!=other.st){
                return this.st-other.st;
            }
            else{
                return this.et-other.et;
            }
        }
        
    }
}
