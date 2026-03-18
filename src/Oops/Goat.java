package Oops;

public class Goat {
    private String name;
    public Goat(String name){
              this.name=name;
     }
    public void printName(){
        System.out.println("Name="+name);
    }
    public static void main(String[]args){
        Goat r1=new Goat("rex");
        Goat r2=new Goat("fluffy");
        r1.printName();
        r2.printName();
    }
    
}
