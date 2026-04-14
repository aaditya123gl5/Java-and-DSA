package basics;
import java.util.*;

public class PrimeNo {
    public static void main(String[]args){

    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int count=0;
    for(int i=2;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==1){
        System.out.println(" It is Prime number");
    }
    else{
        System.out.println("Not a Prime number");
    }
}
}

    
