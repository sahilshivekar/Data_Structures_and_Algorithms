package oop.Inheritance;

/*
 * In Multilevel Inheritance, a class inherits from another class, which
 * itself inherits from a third class. this forms a chain of inheritance.
 */

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1();
        myDog.eat(); // Inherited from Animal
        myDog.sleep(); // Inherited from Mammal
        myDog.bark(); // Dog's own method
    }
}

// ! Grandparent class
class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// ! Parent class
class Mammal1 extends Animal1 {
    void sleep() {
        System.out.println("This mammal sleeps.");
    }
}

// ! Child class
class Dog1 extends Mammal1 {
    void bark() {
        System.out.println("The dog barks.");
    }
}