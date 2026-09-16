package Generics;

import java.util.List;

import java.util.ArrayList;

public class WildCardGenericUsingObject {

     public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        fun(dogs);

        List<Animal3> animals = new ArrayList<>();
        animals.add(new Animal3());
        animals.add(new Animal3());
        fun(animals);

    }

    static void fun(List<?> values) {

        for(Object obj: values) {

         //System.out.println(obj.getClass().getName());//class name with Package
          System.out.println(obj.getClass().getSimpleName());//Only class name

    }

    }

}

class Animal3 {
    void eat() {
        System.out.println("Animal Eating");
    }
    void walk() {
        System.out.println("Walking");
    }

}

class Dog extends Animal3 {
    @Override
    void eat() {
         System.out.println("Dog Eating");
    }

    void bark() {
        System.out.println("Barking");
    }

}

