package Enumeration;
enum Color{
    RED, GREEN, BLUE;
    
}
public class Iteration{
    
    public static void main(String[] args){
        //values()-> return an array of all constant inside enums
        for (Color c : Color.values()){
            
            System.out.println(c);
        }
    }
}
