package com.tap.nirjala.demo.shallow_deep_copy;

public class HR_shallow {

    public int HrId;
    public Employee_shallow employee;

    public HR_shallow(int HrId, Employee_shallow emp) {
        this.HrId = HrId;
        this.employee = emp; //referance copy (shallow copy)
    }

}
