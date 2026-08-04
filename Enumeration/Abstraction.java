package Enumeration;

public class Abstraction {
    enum Day{
    MONDAY{
        public String getNumber(){
            return "1st day"; 
            
        }
    },
    FRIDAY{
        public String getNumber(){
            return "5th day"; 
            
        }
    };
    public abstract String getNumber();
}
public static void main(String[] args){
     System.out.println(Day.MONDAY.getNumber()); 
     System.out.println(Day.FRIDAY.getNumber());

    }
}
