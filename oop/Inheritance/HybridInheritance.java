package oop.Inheritance;

public class HybridInheritance {
    public static void main(String[] args) {
        Bat myBat = new Bat();
        myBat.eat();  // Inherited from Animal
        myBat.sleep(); // Inherited from Mammal
        myBat.fly();  // Implemented method from FlyableF
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

// ! Interface
interface Flyable {
    void fly();
}

// ! Child class combining multiple inheritance types
class Bat extends Mammal implements Flyable {
    public void fly() {
        System.out.println("The bat flies.");
    }
}
