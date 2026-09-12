package Classes;

public class CheckingInstance {
    public static void main(String[] args) {
        
    Object obj = "Hello World";

     if (obj instanceof String) {
   
    String str = (String) obj; 
    System.out.println(str.toUpperCase());
 }
  }
}
