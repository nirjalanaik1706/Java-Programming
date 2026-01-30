package com.tap.nirjala.demo.shallow_deep_copy;

public class HR_deep {
    Employee_deep deep;
    String emp_name;
    int HR_Id;

    public HR_deep(Employee_deep deep,String emp_name, int HR_Id) {
        this.deep=deep;
        this.emp_name = emp_name;
        this.HR_Id = HR_Id;
    }

    // public void display() {
    //     System.out.println("Employee Id: " + HR_Id);
    //     System.out.println("Employee name: " + emp_name);
    // }
}
