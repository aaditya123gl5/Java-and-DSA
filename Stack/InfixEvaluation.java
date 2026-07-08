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
    
     Stack<Character> operators = new Stack<>();
     Stack<Integer> operands = new Stack<>();
    
    
     for(int i=0; i<exp.length(); i++)
     {
        char ch = exp.charAt(i);
        if(ch=='('){
            operators.push(ch);
        }
        else if(Character.isDigit(ch)){ //Check whether a character is digit
            operands.push(ch-'0'); //Character to Integer
        } 
        else if(ch==')'){
            while(operators.peek()!='('){
                char optor=operators.pop();
                int v2=operands.pop();
                int v1=operands.pop();

                int  opv=  performOp(v1 , optor, v2);
                operands.push(opv);

            }
            operators.pop();
        }
        else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            while(operators.size()>0&&operators.peek()!='('&& precedence(ch)<=precedence(operators.peek())){
                //Loop continues as long as operator stack is not empty or top of operator is not '('
                //or Operator on stack has higher or qual precedence than the current operator
                char optor=operators.pop();
                int v2=operands.pop();
                int v1=operands.pop();

                int  opv=  performOp(v1 , optor, v2);
                operands.push(opv);

            }
            operators.push(ch);
        }
    }
    while(operators.size()!=0)
    {
        int val2 = operands.pop();
        int val1 = operands.pop();
        char optor=operators.pop();
        int opv = performOp(val1, optor, val2);
        operands.push(opv);
    }
    System.out.println(operands.peek());
 }
}
