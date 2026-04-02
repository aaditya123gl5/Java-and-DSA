package basics;
import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int st=1;
    int sp=n-1;
    for(int i=0;i<n;i++){
        for(int j=0;j<sp;j++){
            System.out.print("");
        }
         for (int j=0;j<st;j++){
            System.out.print("*");
        }

        System.out.println();
        sp--;
        st++;

    }
}
}
