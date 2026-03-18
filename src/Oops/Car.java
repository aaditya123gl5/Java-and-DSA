package Oops;

public class Car {
    private String make="Tesla";
    private String model="y";
    private int doors=4;
    private String color="red";
    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", doors=" + doors + ", color=" + color + "]";
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //public boolean isConvert() {
        //return convert;
    //}
    //public void setConvert(boolean convert) {
        //this.convert = convert;
    //}
    public static void main(String[]args){
        Car c1=new Car();
        System.out.println(c1);

    }
    
}