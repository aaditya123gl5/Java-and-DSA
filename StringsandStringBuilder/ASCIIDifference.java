package StringsandStringBuilder;
import java.util.*;
public class ASCIIDifference {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter string");
        String str=scn.nextLine();
        System.out.println(Solution(str));
    }
    public static String Solution(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0)); 
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char prev=str.charAt(i-1);
            int gap=curr-prev;
            sb.append(gap);
            sb.append(curr);
        }   
        return sb.toString();
    }
}
