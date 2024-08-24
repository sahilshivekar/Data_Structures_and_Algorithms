package oop;

/*
 * In single inheritance a class (subclass) inherits from one other class (superclass).
 */

public class SingleInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method
        myDog.bark(); // Subclass method
    }
}

// ! Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// ! Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}