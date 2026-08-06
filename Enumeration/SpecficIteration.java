package Enumeration;
import java.util.EnumSet;

public class SpecficIteration {
     enum Day{
        
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; 
        
    }

    public static void main(String[] args){
        
        EnumSet<Day> workDays = EnumSet.range(Day.TUESDAY, Day.FRIDAY);
        for (Day d : workDays){
            
            System.out.println(d);
        }
    }
}
