package oop;

public class ClassesAndObjects {
    public static void main(String[] args) {

        /*
         * An object is an instance of class. When a class is defined, no memory
         * is allocated until an object of that class is created. Object are real
         * world entities created from the classes and they contain actual values
         * for the attributes defined in the classs.
         */
        SoftwareEngineer se = new SoftwareEngineer();

        //setting values of the object
        se.setSalary(7000000);
        se.setGender('m');
        se.addSkills("DSA");
        se.addSkills("Backend");
        se.addSkills("Android");

        //accessing the values of the object
        for (String skill : se.skills) {
            System.out.println(skill);
        }
        System.out.println(se.gender);
        System.out.println(se.salary);
    }
}

/*
 * A class in java is blueprint or template for creating objects.
 * It defines the properties and methods or functions that the objects created
 * from the class will have.
 */

class SoftwareEngineer {
    String[] skills = new String[10];
    int salary;
    char gender;
    int i = 0;

    void addSkills(String skill) {
        skills[i++] = skill;
    }

    void setSalary(int newSalary) {
        salary = newSalary;
    }

    void setGender(char inputGender) {
        gender = inputGender;
    }
}