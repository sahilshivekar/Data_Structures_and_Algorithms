package oop;

/*
 * 
 * Abstraction in OOP is the concept of simplifying complex systems by focusing 
 * only on the essential features and hiding the implementation details.
 * t allows you to work with a simplified model and ignore the complexities 
 * of how things work internally.
 * 
 * - Cannot create an instance of abstract class
 * - Can have abstract/non-abstract methods
 * - Can have constructors
 */
public class abstraction {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.makeSound();
        myCat.sleep();
        System.out.println(myCat.color);
    }
}

// ! Abstract class
abstract class Animal4 {
    String color;

    Animal4() {
        color = "red";
        System.out.println("Animal constructor called");
    }

    // Abstract method (does not have a body)
    abstract void makeSound();

    void sleep() {
        System.out.println("Animal sleep");
    }
}

// ! subclass (inheriting from Animal)
class Cat extends Animal4 {
    Cat() {
        System.out.println("Cat constructor called");
    }

    // Implementing the abstract method
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}