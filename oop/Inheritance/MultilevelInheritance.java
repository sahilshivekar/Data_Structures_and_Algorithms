package oop.Inheritance;

/*
 * In Multilevel Inheritance, a class inherits from another class, which
 * itself inherits from a third class. this forms a chain of inheritance.
 */

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited from Animal
        myDog.sleep(); // Inherited from Mammal
        myDog.bark(); // Dog's own method
    }
}

// ! Grandparent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// ! Parent class
class Mammal extends Animal {
    void sleep() {
        System.out.println("This mammal sleeps.");
    }
}

// ! Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}