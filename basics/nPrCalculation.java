package basics;
import java.util.*;

public class nPrCalculation {
    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv;
    }
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=scn.nextInt();
        System.out.println("Enter value of r");
        int r=scn.nextInt();
        int nfact=fact(n);
        int nmrfact=fact(n-r);
        int nPr=nfact/nmrfact;
        System.out.println("Possible number of permutation are");
        System.out.println(n+"P"+r+"="+nPr);
    }
}

