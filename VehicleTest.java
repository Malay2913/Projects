abstract class Vehicle 
{
    abstract void startEngine();
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine started");
    }
}

class Motorcycle extends Vehicle
{
    void startEngine() {
        System.out.println("Motorcycle engine started");
    }
}

public class VehicleTest 
{
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.startEngine();  
        motorcycle.startEngine();  
    }
}