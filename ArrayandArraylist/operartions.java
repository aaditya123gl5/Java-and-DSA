package ArrayandArraylist;

import java.util.ArrayList;

public class operartions {
    public static void main(String[]args){
    ArrayList<Integer> num = new ArrayList<>();
    num.add(10);
    num.add(20);
    num.add(30);
    System.out.println(num.size());
    num.remove(0);
    System.out.println(num);
    num.add(60);
    num.remove(Integer.valueOf(20));
    System.out.println(num);
    }
}
