package Enumeration;

public class MethodAndConstructor {
    enum Color{
    RED, GREEN, BLUE;
    private Color(){
        System.out.println("Constructor called for: " + this);
    }//this->the current color object
    public void display(){
        System.out.println("Color is: " + this);
    }
}
    public static void main(String[] args){
        Color c1 = Color.RED;
        c1.display();
    }
}
    