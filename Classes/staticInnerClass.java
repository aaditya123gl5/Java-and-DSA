package Classes;

public class staticInnerClass {
    public static void main(String[] args) {

        Outer2 outer = new Outer2();

        Outer2.Inner inner = new Outer2.Inner(outer);
        inner.fun();
    }
}

// Static nested class
class Outer2 {
    private static int x = 4;
    int y;

    static class Inner {

        Outer2 outer;
        private String name;
        private static int number;

        Inner(Outer2 outer) {
            this.outer = outer;
        }

        void fun() {
            System.out.println(x);
            System.out.println(outer.y);
        }

        static void fun2() {

        }
    }
}

class BankAccount {

    private static class InterestCalculator {
        static double calculateYearly(double principal, double rate) {
            return principal * rate;
        }
    }

    public double computeIntersest(double principal) {
        return InterestCalculator.calculateYearly(principal, 0.09);
    } 
}
