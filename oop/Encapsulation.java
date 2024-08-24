package oop;

/*
 * Encapsulation is one of the four pillars of object-oriented programming (OOP). 
 * It involves bundling data (attributes) and methods (functions) into a single 
 * unit or class while restricting direct access to some of the object's 
 * components. This prevents unauthorized or unintended interference with the
 * object's data.
 * 
 * 
 * Key concepts: 
 * 
 *      Data Hiding: 
 *      Encapsulation hides an object's internal state from the outside world. 
 *      The data is kept private and can only be accessed or modified through 
 *      public methods like getters and setters, protecting the data's integrity.
 * 
 *      Access Modifiers: Encapsulation is enforced using access modifiers 
 *      (private, protected, public). Making data members private prevents 
 *      external classes from accessing them directly.
 * 
 *      Getter and Setter Methods: Public methods that provide controlled access 
 *      to private data members. Getters retrieve the value, while setters allow 
 *      controlled updates.
 */

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccNumber("sbi230472184");
        ba.setPassword("$pwd@12345");
        System.out.println(ba.getAccNumber());
    }
}

class BankAccount {
    public String accNumber;
    private String password;

    void setAccNumber(String accNumber) {
        this.accNumber = accNumber; // this keyword is used to refer to the current object
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getAccNumber() {
        return this.accNumber;
    }

}