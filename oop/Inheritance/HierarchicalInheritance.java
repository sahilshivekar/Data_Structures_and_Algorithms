package oop.Inheritance;

/*
 * In Hierarchical Inheritance, multiple classes inherit from a single superclass.
 */

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        Cat myCat = new Cat();
        myDog.eat(); // Inherited from Animal
        myDog.bark(); // Dog's own method
        myCat.eat(); // Inherited from Animal
        myCat.meow(); // Cat's own method
    }
}

// ! Superclass
class Animal3 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// ! Subclass 1
class Dog2 extends Animal3 {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// ! Subclass 2
class Cat extends Animal3 {
    void meow() {
        System.out.println("The cat meows.");
    }
}