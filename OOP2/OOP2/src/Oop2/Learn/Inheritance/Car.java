package Oop2.Learn.Inheritance;

// a car is a vehicle, so it's extending from Car and is getting all inherited methods and variables
public class Car extends Vehicle {
    private int doors;
    private int engineCapacity;

    public Car(int doors, int engineCapacity, String name) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public int getDoors() {
        return doors;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}
