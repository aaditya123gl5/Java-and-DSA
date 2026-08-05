package Oops.Interfaces;

//enum is being used as there exists fixed flight stages
enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;
    @Override
    public void track() { //Monitor current stage

        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() { 
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];//creates circular transition
    }
    /*values() return enum element like GROUNDED, LAUNCH */
    /*ordinal() return index of enum element */
}

record DragonFly(String name, String type) implements FlightEnabled {
    @Override
    public void takeOff() {

    }
    @Override
    public void land() {

    }
    @Override
    public void fly() {
    }
}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNDED; //stage->GROUNDED
    
    public void achieveOrbit() {
        transition("Orbit achieved!");
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {

        transition("Landing");
    }

    @Override
    public void fly() {

        achieveOrbit();
        transition("Data Collection while Orbiting");
    }

    public void transition(String description) {

        System.out.println(description);
        stage = transition(stage);
        stage.track();
    }
}
//every object orbiting earth
interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();
   //private->This method can only be used inside the OrbitEarth interface.
    private static void log(String description) {
        var today = new java.util.Date(); //Date class store current date and time
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description) {

        //stage → a flight stage (e.g., GROUNDED, LAUNCH, CRUISE)
        //desription → a text message
        description = stage + ": " + description; 
        log(description);
    }
    //
    @Override
    default FlightStages transition(FlightStages stage) {

        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void takeOff();
    void land();
    void fly();

    default FlightStages transition(FlightStages stage) {
    //System.out.println("transition not implemented on " + getClass().getName());
    //return null;
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }

}

interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();
}
