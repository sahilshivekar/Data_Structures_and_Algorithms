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
class Animal2 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// ! Parent class
class Mammal2 extends Animal2 {
    void sleep() {
        System.out.println("This mammal sleeps.");
    }
}

// ! Interface
interface Flyable1 {
    void fly();
}

// ! Child class combining multiple inheritance types
class Bat extends Mammal2 implements Flyable1 {
    public void fly() {
        System.out.println("The bat flies.");
    }
}
