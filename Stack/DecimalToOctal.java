package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToOctal {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Decimal number");
        int num=scn.nextInt();
        Stack<Integer> st=new Stack<>();
        while(num>0){
            int rem=num%8;
            st.push(rem);
            num/=8;
        }
        while(!st.isEmpty()){
            System.out.print(st.pop());
        } 
        scn.close();
    }
}
