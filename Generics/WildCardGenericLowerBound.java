package Generics;

import java.util.*;

public class WildCardGenericLowerBound {

    public static void main(String[] args) {

        List<Animal2> animals = new ArrayList<>();

        animals.add(new Animal2());
        animals.add(new Animal2());

        fun(animals);
    }

    public static void fun(List<? super Animal2> values) {

        // Writing
        values.add(new Animal2());
        values.add(new Dog());
        values.add(new Cat());
        values.add(new Labrador());

        // Reading
        for (Object obj : values) {
            System.out.println(obj.getClass().getSimpleName());
        }
    }
}

class Animal2 {

    void eat() {
        System.out.println("Animal Eating");
    }

    void walk() {
        System.out.println("Walking");
    }
}

class Dog extends Animal2 {

    @Override
    void eat() {
        System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Barking");
    }
}

class Labrador extends Dog {
}

class Cat extends Animal2{
}