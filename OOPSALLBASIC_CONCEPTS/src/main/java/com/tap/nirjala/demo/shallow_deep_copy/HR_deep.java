package com.tap.nirjala.demo.shallow_deep_copy;

public class HR_deep {

    Employee_deep deep;
    String position;
    int HR_Id;

    public HR_deep(Employee_deep deep, String position, int HR_Id) {
        this.deep = deep;
        this.position = position;
        this.HR_Id = HR_Id;
    }

    public HR_deep(HR_deep hr) {
        this.position = hr.position;
        this.HR_Id = hr.HR_Id;
        this.deep = new Employee_deep(hr.deep);
    }

    @Override
    public String toString() {
        return "HR ID: " + HR_Id + ", position: " + position + ", " + deep;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
