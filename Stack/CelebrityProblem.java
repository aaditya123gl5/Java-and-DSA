package Stack;
import java.util.*;
import java.io.*; 

public class CelebrityProblem {
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[][] arr=new int[n][n];
        /*
             String[] parts=line.split("");
             for(int j=0;j<n;j++){
               arr[i][j]=Intger.parseInt(parts[j]);
             }  
            or
            String[] parts=line.trim().split("\\s+");   
            trim removes trailing/leading whitespace
            \\s+ ->  One or more whitespace character                                   
        */
        for(int i=0;i<n;i++){                       
            String line=br.readLine();              
            for(int j=0;j<n;j++){                    
                arr[i][j]=line.charAt(j)-'0';        
            }                                        
        }
        findCelebrity(arr);
    
    }
    public static void findCelebrity(int[][]arr){
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            st.push(i);
        }
        while(st.size()>=2){
            int i=st.pop();
            int j=st.pop();
            if(arr[i][j]==1){
                //If i knows j -> Then i is not celebrity
                st.push(j);
            }else{
                //If i doesn't know j-> Then j is not celebrity
                st.push(i);
            }
        }
            int pot=st.pop(); //Potential celebrity
            for(int k=0;k<arr.length;k++){
                if(k!=pot){
                    if(arr[k][pot]==0||arr[pot][k]==1){
                        System.out.println("None");
                        return;
                    }
                    
                }
                
            }
            System.out.println(pot);
           
            
        }
      

 }


