package oop;

/*
 * Interface is a blueprint of a class
 * 
 * all methods are public, abstract & without implementation
 * Used to acheive abstraction
 * Variables in interface are final, public and static
 */
public class Interfaces {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car();
        myCar.startEngine(); // Output: Car engine started.
        myCar.honk(); // Output: Car is honking.
        myCar.stopEngine(); // Output: Car engine stopped.

        // Creating a Bike object
        Bike myBike = new Bike();
        myBike.startEngine(); // Output: Bike engine started.
        myBike.kickStart(); // Output: Bike is kick-started.
        myBike.stopEngine(); // Output: Bike engine stopped.
    }
}

// Interface definition
interface Vehicle {
    // Abstract method (no body)
    void startEngine();

    // Abstract method (no body)
    void stopEngine();
}

// Class Car implementing the Vehicle interface
class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    // Additional method specific to Car
    void honk() {
        System.out.println("Car is honking.");
    }
}

// Class Bike implementing the Vehicle interface
class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bike engine stopped.");
    }

    // Additional method specific to Bike
    void kickStart() {
        System.out.println("Bike is kick-started.");
    }
}
