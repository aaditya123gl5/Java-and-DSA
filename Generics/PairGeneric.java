package Generics;

public class PairGeneric {
     public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(23, "Aditya");
        
        System.out.println(p1.first + " , " + p1.second);
    }
}

//Generic class
class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}
