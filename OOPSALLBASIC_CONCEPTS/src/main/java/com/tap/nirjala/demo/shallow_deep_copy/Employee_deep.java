package com.tap.nirjala.demo.shallow_deep_copy;

public class Employee_deep {
    public String name;

    

    public Employee_deep(String name){
        this.name=name;
    }
    public Employee_deep(Employee_deep emp_deep) {
        this.name=emp_deep.name;
    }
     @Override
    public String toString() {
        return "Employee Name: " + name;
    }


}
