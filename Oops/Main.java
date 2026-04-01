package Oops;

public class Main {
    public static void doAnimalStuff(Animal en,String speed){
        en.makeNoise();
        en.move(speed);
        System.out.println(en);
        System.out.println("-------------------------------");
    }
    public static void main(String[]args){
        Animal en=new Animal("Generic","large",400);
        doAnimalStuff(en,"slow");
        Dog dg=new Dog();
        doAnimalStuff(dg,"fast");
        Dog yorkie=new Dog("yorkie",13);
        doAnimalStuff(yorkie,"fast");
        Dog retriver=new Dog("Labrador.retriver",65,"floppy","swimmer");
        doAnimalStuff(retriver,"slow");
    }
    
}
