package ArrayList;
import java.util.*;

public class RemovalOfOddNo {
     public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
           al.add(scn.nextInt());
        }
        System.out.println("Original List: " + al);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {//Runs until element is left in arraylist

            int i = itr.next(); //Return next element in Arraylist

            if (i % 2 != 0) {
                itr.remove();
            }
        }

        System.out.println();
        System.out.println("Modified List: " + al);
    }
    
}
