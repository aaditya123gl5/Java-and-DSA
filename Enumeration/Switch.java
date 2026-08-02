package Enumeration;

public class Switch{
    enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW;
    }
    public static void main(String[] args){
        Color var_1 = Color.YELLOW;
        switch (var_1) {
        case RED -> System.out.println("Red color");
        case GREEN -> System.out.println("Green color");
        case BLUE -> System.out.println("Blue color");
        default -> System.out.println("Other color");
        }
    }
}
