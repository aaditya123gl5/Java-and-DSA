package Stack;
import java.util.*;
//Give true when duplicates brackets(Not necessary brackets) is found
public class DuplicateBrackets {
    public static void main(String[]args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter expression");
    String str=scn.nextLine();
    Stack<Character> st=new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(ch==')'){
            if(st.peek()=='('){
                System.out.println(true);
                return;

            }else{
                while(st.peek()!='('){
                    st.pop();
                }
                 st.pop();
            }

        }else{
            st.push(ch);
        }
    }
     System.out.println(false);
    }
}
