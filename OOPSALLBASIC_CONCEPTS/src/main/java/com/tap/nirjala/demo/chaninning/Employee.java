package com.tap.nirjala.demo.chaninning;

public class Employee {

    protected String name;
    protected int age;
    protected String email;
    protected double salary;

    Employee()
    {
        this("nirjala",21, "nirjala@gmailcom", 100000);
        System.out.println("default constructor");
    }

    Employee(String name, int age, String email, double salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.salary = salary;

        System.out.println("parameterized constructor");
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
    }

}


