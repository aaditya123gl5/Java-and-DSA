package Generics;

public class InterfaceGenerics {
    public static void main(String[] args) {
        Box<Fish> b1 = new Box<>();
    }
}
//T extends Animal-> This box class can work with Animal and its subtype (Dog,Fish)
//T extends Animal & Swimmable -> This box class can work with only Fish
class Box<T extends Animal & Swimmable> {
    T value;
}

class Animal {
    void display() {
        System.out.println("Displaying Animal");
    }
}

interface Swimmable {
    void swim();
}

class Dog extends Animal {

}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
