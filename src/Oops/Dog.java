package Oops;

public class Dog extends Animal {
    public Dog(){
        super("Mutt","big",50);
        
    }
    public Dog(String type, double weight){
        this(type,weight,"Perky","Curled");
    }
    public Dog(String type , double weight, String earshape , String tailshape){
        super(type,weight<15?"small":(weight<35?"medium":"large"),weight);
    }
    
    @Override
    public void move(String speed){
        super.move(speed);
        System.out.println("Dog walks, run and wag their tails");
    }
    
}
