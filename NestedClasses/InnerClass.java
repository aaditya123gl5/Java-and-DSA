package NestedClasses;

public class InnerClass{
    public static void main(String[] args) {

        Outer1 outer = new Outer1();
        
        //Outer.Inner inner = new Outer.Inner();

        Outer1.Inner inner =  outer.new Inner();

       // Outer.Inner inner = new Outer().new Inner();

        inner.fun();
        inner.fun2();
        Outer.Inner.fun2();
    }
}

class Outer1{

    int x = 10;

    class Inner {
        //int x = 20;

        //Outer outer;

        static int x = 10;

        void fun() {
            System.out.println(x);
            //System.out.println(Outer.this.x);
        }

        static void fun2() {
            System.out.println("Hello");
        }
    }
}
