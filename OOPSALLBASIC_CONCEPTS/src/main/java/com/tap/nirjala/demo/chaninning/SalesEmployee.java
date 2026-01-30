package com.tap.nirjala.demo.chaninning;

public class SalesEmployee extends Employee {

    private double commission;

    SalesEmployee(String name, int age, String email, double salary, double commission) {
        super(name, age, email, salary);
        this.commission = commission;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Commission: " + commission);
}
}