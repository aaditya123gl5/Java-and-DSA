package Stack;

import java.io.*;
import java.util.*;

public class InfixEvaluation {
    public static int precedence(char op){
    if(op == '+' || op == '-') return 1;
    if(op == '/' || op == '*') return 2;
    return 0;
    }
    public static int performOp(int val1, char op, int val2){
     if(op == '+')
        return val1 + val2;
    
     else if(op == '-')
        return val1 - val2;
        
     else if(op == '/')
        return val1 / val2;
     else   
        return val1 * val2;
    }
    public static void main(String[] args) throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String exp = br.readLine();
    
     Stack<Character> optors = new Stack<>();
     Stack<Integer> opnds = new Stack<>();
    
    
     for(int i=0; i<exp.length(); i++)
     {
        char ch = exp.charAt(i);
        if(ch=='('){
            optors.push(ch);
        }
        else if(Character.isDigit(ch)){
            opnds.push(ch-'0'); //Character to Integer
        } 
        else if(ch==')'){
            while(optors.peek()!='('){
                char optor=optors.pop();
                int v2=opnds.pop();
                int v1=opnds.pop();

                int  opv=  performOp(v1 , optor, v2);
                opnds.push(opv);

            }
            optors.pop();
        }
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            while(optors.size()>0&&optors.peek()!='('&& precedence(ch)<=precedence(optors.peek())){
               char optor=optors.pop();
                int v2=opnds.pop();
                int v1=opnds.pop();

                int  opv=  performOp(v1 , optor, v2);
                opnds.push(opv);

            }
            optors.push(ch);
        }
    }
    while(optors.size()!=0)
    {
        int val2 = opnds.pop();
        int val1 = opnds.pop();
        char optor=optors.pop();
        int opv = performOp(val1, optor, val2);
        opnds.push(opv);
    }
    System.out.println(opnds.peek());
 }
}
