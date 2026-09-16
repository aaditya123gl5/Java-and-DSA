package Generics;
import java.util.ArrayList;
import java.util.List;

// Wildcard with upper bound (extends )

public class WilcardGenericUpperBound {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        // List<Animal> animals = new ArrayList<>();
        // animals.add(new Animal());
        // animals.add(new Animal());

        // List<Integer> l = new ArrayList<>();

        fun(dogs);
    }
    static void fun(List<? extends Animal1> values) {
        // for(Animal a : values) {
        // a.eat();
        // }

        //values.add(new Dog());
    }
}

class Animal1 {
    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Animal1 {
    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal1 {

}