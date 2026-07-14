package Stack;
import java.util.*;
import java.io.*;

public class PrefixEvaluationAndConversion {
    public static void main(String[]args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter prefix expression");
        String exp=br.readLine();
        
        Stack<Integer> vs=new Stack<>();
        Stack<String> ps=new Stack<>();
        Stack<String> is=new Stack<>();
       
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                int v1=vs.pop();
                int v2=vs.pop();
                int val=Operation(v1,v2,ch);
                vs.push(val);

                String iv1=is.pop();
                String iv2=is.pop();
                String ival="("+iv1+ch+iv2+")";
                is.push(ival);

                String  pv1=ps.pop();
                String pv2=ps.pop();
                String pval=pv1+pv2+ch;
                ps.push(pval);
                

            }
            else{
                ps.push(ch+"");
                is.push(ch+"");
                vs.push(ch-'0');
            }
        }
        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }
    public static int Operation(int val1, int val2, char op){
     if(op == '+')
        return val1 + val2;
    
     else if(op == '-')
        return val1 - val2;
        
     else if(op == '/')
        return val1 / val2;
     else   
        return val1 * val2;
    }


}
