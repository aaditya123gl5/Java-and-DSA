package ArrayandArraylist;
import java.util.*;

public class Implementation {
    public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    List<Integer> num=new ArrayList<>();
    System.out.println("Enter number of elements");
    int n=scn.nextInt();
    for(int i=0;i<n;i++){
        num.add(scn.nextInt());
    }
    System.out.println(num);
    System.out.println("Enter element you want to search");
    System.out.println(num.contains(scn.nextInt()));

  }  
}
