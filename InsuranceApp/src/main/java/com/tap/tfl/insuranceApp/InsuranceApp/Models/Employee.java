package com.tap.tfl.insuranceApp.InsuranceApp.Models;


import java.time.LocalDateTime;

public class Employee{
    private int employeeId;
    private String employeeCode;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private String mobileNumber;
    private String department;
    private String designation;
    private LocalDateTime dateOfJoining;
    private float salary;
    private boolean isActive;
    private String address;

    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }

    // employeeCode
public String getEmployeeCode() {
    return employeeCode;
}

public void setEmployeeCode(String employeeCode) {
    this.employeeCode = employeeCode;
}

// firstName
public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

// lastName
public String getLastName() {
    return lastName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

// fullName
public String getFullName() {
    return fullName;
}

public void setFullName(String fullName) {
    this.fullName = fullName;
}

// email
public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

// mobileNumber
public String getMobileNumber() {
    return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
}

// department
public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

// designation
public String getDesignation() {
    return designation;
}

public void setDesignation(String designation) {
    this.designation = designation;
}

// salary
public float getSalary() {
    return salary;
}

public void setSalary(float salary) {
    this.salary = salary;
}

// isActive
public boolean isActive() {
    return isActive;
}

public void setActive(boolean active) {
    isActive = active;
}

// address
public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public LocalDateTime getDateOfJoining(){
    return dateOfJoining;
}

public void setDateOfJoining(LocalDateTime dateOfJoining){
    this.dateOfJoining=dateOfJoining;
}


}



