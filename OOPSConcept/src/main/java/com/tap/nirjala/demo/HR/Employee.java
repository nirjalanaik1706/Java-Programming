package com.tap.nirjala.demo.HR;

import com.tap.nirjala.demo.HR.Interfaces.IAppraisable;

public abstract class Employee implements IAppraisable{

    private  int id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String contactNumber;
    protected String location;


    public Employee(int id,String firstName,String lastName,String email,String contactNumber,String location) {
        
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.contactNumber=contactNumber;
        this.location=location;
    }

    public abstract void doWork();

    public double computePay(){
        return 0;
    }

    public String toString(){
        return "Employee["+this.getClass().getSimpleName()+"]\n"+"id="+id+"\n"+"firstName="+firstName+"\n"+"lastName="+lastName+"\n"+"email="+email+"\n"+"contactNumber="+contactNumber+"\n"+"location="+location;

    }

    public void ConductAppraisal()
    {
        System.out.println("Sales Employee appraisal completed.");
    }
}

