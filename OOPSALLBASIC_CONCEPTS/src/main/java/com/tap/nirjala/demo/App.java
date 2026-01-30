package com.tap.nirjala.demo;

import java.security.Policy;

import com.tap.nirjala.demo.shallow_deep_copy.Employee_deep;
import com.tap.nirjala.demo.shallow_deep_copy.HR_shallow;
import com.tap.nirjala.demo.shallow_deep_copy.Employee_shallow;
import com.tap.nirjala.demo.shallow_deep_copy.HR_deep;

public class App {

    public static void main(String[] args) {
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

        HR_deep empdeep=new HR_deep("nirjala",2);

        HR_deep empdeep2=new HR_deep(empdeep);

        empdeep2=empdeep;
        }
}
