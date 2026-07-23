package StringsandStringBuilder;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[]args){
    Scanner scn=new Scanner(System.in);
    String s=scn.nextLine();
    //System.out.println(Integer.parseInt(s));
    int num=0;
    int len=s.length();
    for(int i=0;i<len;i++){
        int currch=(int)(s.charAt(i));
        num=num*10+(currch-48);
    }
    System.out.println(num);
    }
    
}
