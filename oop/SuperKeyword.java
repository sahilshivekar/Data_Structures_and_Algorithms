package oop;

/*
 * Super keyword is used to refer immediate parent class object
 * 
 * Used to access parent's properties
 * Used to access parent's functions
 * Used to access parent's constructor
 */

public class SuperKeyword {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        System.out.println(m.getColor());
    }
}

class Device {
    String color = "red";
}

class Mobile extends Device {
    Mobile() {
        System.out.println(super.color);
        super.color = "blue";
    }

    String getColor() {
        return this.color;
    }
}