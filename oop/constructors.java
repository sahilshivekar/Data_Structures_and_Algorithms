package oop;

/*
 * Constructor is a special method in java which gets invoked automatically
 * at the time of object creation.
 * 
 * constructors have the same name as class.
 * constructors don't have a return type.
 * constructors are only called once, at object creation.
 * memory allocation happens when constructor is called.
 * we can write more than one contructor but with different parameters and the
 * constructor with matching parameters will get executed.
 */
public class constructors {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sahil");
        Student s3 = new Student(86);
        Student s4 = new Student("Sahil", 86);
        Student s5 = new Student(68, "Shubham");
        Student s6 = new Student(s4); //copy constructor
    }
}

class Student {
    private String name;
    private int rollNo;

    Student() {
        System.out.println("c1");
        System.out.println("Student is created");
    }

    Student(String name) {
        System.out.println("c2");
        this.name = name;
    }

    Student(int rollNo) {
        System.out.println("c3");
        this.rollNo = rollNo;
    }

    Student(String name, int rollNo) {
        System.out.println("c4");
        this.name = name;
        this.rollNo = rollNo;
    }

    Student(int rollNo, String name) {
        System.out.println("c5");
        this.name = name;
        this.rollNo = rollNo;
    }

    //copy constructor
    Student(Student s){
        System.out.println("c6");
        this.name = s.name;
        this.rollNo = s.rollNo;
        System.out.println(this.name);
        System.out.println(this.rollNo);
    }

    void setName(String name) {
        this.name = name;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    String getName() {
        return this.name;
    }

    int getRollNo() {
        return this.rollNo;
    }
}
