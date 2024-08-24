package oop;

/*
 * Runtime Polymorphism: Achieved through method overriding, where a subclass 
 * provides a specific implementation of a method that is already defined in 
 * its parent class.
 * 
 * Compile-Time Polymorphism: Achieved through method overloading, where multiple 
 * methods with the same name but different parameters are defined in the same class.
 */

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls the first method in Animal

        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method in Dog
        myDog.makeSound(3); // Calls the overloaded method in Dog
    }
}

// ! Parent class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    // Method overloading
    void makeSound(String sound) {
        System.out.println("The animal makes a sound: " + sound);
    }
}

// ! Child class
class Dog extends Animal {
    // Overriding the method from Animal
    @Override
    /*
     * The @Override annotation in Java indicates that a method in a subclass
     * is intended to override a method in its superclass. It ensures compile-time
     * checking to prevent errors if the method signature does not match the
     * superclass method.
     */
    void makeSound() {
        System.out.println("The dog barks.");
    }

    // Method overloading in child class
    void makeSound(int times) {
        System.out.println("The dog barks " + times + " times.");
    }
}