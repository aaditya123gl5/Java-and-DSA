package ArrayandArraylist;

import java.util.*;
public class AllElementsSum {
    public static void main(String[]args){
    Scanner scn=new Scanner(System.in);
    List<Integer> list=new ArrayList<>();
    int size=scn.nextInt();
    for(int i=0;i<size;i++){
        list.add(scn.nextInt());
    }
    System.out.println(list);
    int sum=0;
    //for(Integer num:list){
       // sum=sum+num;
    //}
    for(int i=0;i<list.size();i++){
        sum=sum+list.get(i);
    }

    System.out.println(sum);
}

}
