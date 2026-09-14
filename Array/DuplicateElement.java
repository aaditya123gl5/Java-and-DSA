package Array;

import java.io.*;
import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean flag=false;
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Set<Integer> set=new HashSet<>();
        for(int word:arr){
            if(set.contains(word)){
               flag=true;
                break;
            }
            else{
                set.add(word);
            }
        }
        if(flag==true){
            System.out.println("Duplicate element");
        }
        else{
            System.out.println("No duplicate");
        }

    }
}
