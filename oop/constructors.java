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
        s4.marks[0] = 97;
        s4.marks[1] = 100;
        s4.marks[2] = 0;
        Student s5 = new Student(68, "Shubham");
        s5.marks[0] = 9;
        s5.marks[1] = 10;
        s5.marks[2] = 4;

        Student s6 = new Student(s4); 
        System.out.println(s6.getRollNo());
        System.out.println(s6.getName());
        for (int i : s6.marks) {
            System.out.println(i);
        }
        s4.marks[2] = 99;
        for (int i : s6.marks) {
            System.out.println(i);
        }
        /*
         * if you use shallow copy it will print the changed marks[2] to 99
         * it is issue that occurs bcz java didn't made a new array of marks
         * for s6 java just created a reference to the to that array
         * 
         * below in the contstructor there are two contructors written
         * one is shallow and another is deep read it.
         */
    }
}

class Student {
    private String name;
    private int rollNo;
    int[] marks = new int[3];

    Student() {
        // System.out.println("c1");
        // System.out.println("Student is created");
    }

    Student(String name) {
        // System.out.println("c2");
        this.name = name;
    }

    Student(int rollNo) {
        // System.out.println("c3");
        this.rollNo = rollNo;
    }

    Student(String name, int rollNo) {
        // System.out.println("c4");
        this.name = name;
        this.rollNo = rollNo;
    }

    Student(int rollNo, String name) {
        // System.out.println("c5");
        this.name = name;
        this.rollNo = rollNo;
    }

    //! shallow copy constructor
    // Student(Student s) {
    //     System.out.println("c6");
    //     this.name = s.name;
    //     this.rollNo = s.rollNo;
    //     this.marks = s.marks;
    // }

    //! deep copy constructor
    Student(Student s) {
        System.out.println("c6");
        this.name = s.name;
        this.rollNo = s.rollNo;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s.marks[i];
        }
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
