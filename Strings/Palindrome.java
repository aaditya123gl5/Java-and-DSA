package Strings;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
    Scanner scn=new Scanner(System.in);
    StringBuilder sb=new StringBuilder(scn.nextLine());
    System.out.println(sb.reverse().toString());
    scn.close();
    }

    
}
