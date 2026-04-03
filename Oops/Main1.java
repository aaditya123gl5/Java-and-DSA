package Oops;
//Main class of Polymorphism

public class Main1 {
    public static void main(String[] args) {

        Car1 car = new Car1("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car1 ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);

        Car1 ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car1 car) {

        car.startEngine();
        car.drive();
    }

    
}
