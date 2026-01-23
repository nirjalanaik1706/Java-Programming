package com.tap.nirjala.demo;

import com.tap.nirjala.demo.HR.Employee;
import com.tap.nirjala.demo.HR.SalesEmployee;
import com.tap.nirjala.demo.HR.SalesManager;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Employee emp2 = new SalesManager(2,"Neha","Patil","neha@company.com","8888888888","Pune",1500, 7000, 30000, 200000, 250000, 10000);
        emp2.doWork();
        System.out.println(emp2);
        System.out.println("Salary: " + emp2.computePay());
    }
}
