package com.tap.nirjala.demo;

import java.security.Policy;

import com.tap.nirjala.demo.shallow_deep_copy.Employee_deep;
import com.tap.nirjala.demo.shallow_deep_copy.HR_deep;
import com.tap.nirjala.demo.shallow_deep_copy.Clone;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        //     //static class
        //     System.out.println( "Hello World!" );
        //     HRDepartment hd=new HRDepartment();
        //     HRDepartment.Policy p=new HRDepartment.Policy();
        //     HRDepartment.Policy.showPolicy(p);
        //     // System.out.println(p);
        //     hd.display();

        //     // final class
        //     FinalClass fc=new FinalClass();
        //     int remainingLeaves= fc.calculateRemainingLeaves(16);
        //     System.out.println("Remaining Leaves:"+ remainingLeaves);
        //     boolean bonusEligibility=fc.isEligibleForBonus(9);
        //     System.out.println("Bonus Eligible :"+bonusEligibility);
        // // Shallow copy
        // Employee_shallow emp=new Employee_shallow("nirjala");
        // HR_shallow hr1=new HR_shallow(1,emp);
        // HR_shallow hr2=new HR_shallow(2,emp);
        // System.out.println(hr2.employee.name);
        // System.out.println(hr1.employee.name); //shallow copy
        // hr2.employee.name="sahil";
        // System.out.println(hr2.employee.name);
        // System.out.println(hr1.employee.name); //shallow copy
        // deep copy
        // Employee_deep ed=new Employee_deep("nirjala");
        // HR_deep empdeep = new HR_deep( ed,"intern", 2);
        // Employee_deep ed2=new Employee_deep(ed);
        // ed2.name="sahil";
        // System.out.println("Original name :"+ ed);
        // System.out.println("copy name: "+ed2);
        // System.out.println(empdeep);
        // clone
        Clone c1 = new Clone("Nirjala");
        // System.out.println(c1);

        Clone c2 = (Clone) c1.clone();
        c2.Name = "sahil";
        c1.Name = "sanika";
        System.out.println(c2);
        System.out.println(c1);

    }
} 
