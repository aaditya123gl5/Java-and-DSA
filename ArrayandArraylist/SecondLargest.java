package ArrayandArraylist;
import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int[] arr={4,6,2,7,9};
    Arrays.sort(arr);
    int l=arr.length;
    System.out.println(arr[l-2]);
    scn.close();
    }

}
