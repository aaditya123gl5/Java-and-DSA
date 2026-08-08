package basics;
import java.util.*;

public class AllArmstrongs{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();
        for(int i=low;i<=high;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
        public static boolean isArmstrong(int num){
            int orginal=num;
            int count=0;
            int temp=num;
            while(temp>0){
               
                temp=temp/10;
                count++;
            }
            int nod=count;
            int res=0;
            temp=num;
            while(temp>0){
                int digit=temp%10;
                res=res+(int)Math.pow(digit,nod);
                temp=temp/10;
            }
            return res==num;
            
        }
}