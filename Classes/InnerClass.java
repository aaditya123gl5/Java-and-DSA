package Classes;

public class InnerClass {

    public static void main(String[] args) {

        Outer1 outer = new Outer1();

        // Creating object of non-static Inner class
        Outer1.Inner inner = outer.new Inner();

        inner.fun();
        inner.fun2();

        // Calling static method using class name
        Outer1.Inner.fun3();
    }
}

class Outer1 {

    int x = 10;

    class Inner {

        static int x = 20;

        void fun() {
            System.out.println(x);
        }

        void fun2() {
            System.out.println("Hello");
        }

        static void fun3() {
            System.out.println("Static method");
        }
    }
}