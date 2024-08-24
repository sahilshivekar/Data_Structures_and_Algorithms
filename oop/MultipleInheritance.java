package oop;

/*
 * Java does not support multiple inheritance directly with classes to avoid complexity.
 * 
 * Instead it uses interfaces to achieve mulitple inheritance.
 */

public class MultipleInheritance {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.fly(); // Implemented method from Flyable
        myDuck.swim(); // Implemented method from Swimmable
    }
}

// ! Interface 1
interface Flyable {
    void fly();
}

// ! Interface 2
interface Swimmable {
    void swim();
}

// ! Class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("The duck flies.");
    }

    public void swim() {
        System.out.println("The duck swims.");
    }
}