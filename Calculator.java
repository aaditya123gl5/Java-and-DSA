package basics;

public class Calculator {
    public void sum(int a, int b){
        System.out.println("Sum="+(a+b));
    }
    public static void main(String[]args){
        Calculator c=new Calculator();
        c.sum(5,10);
        printHello();
    }
    public static void printHello(){
        System.out.println("Hello");
    }

}
