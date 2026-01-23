package com.tap.nirjala.demo.HR;


public class SalesManager extends  SalesEmployee{
    protected double bonus;
    public SalesManager(int id, String firstName, String lastName, String email, String contactNumber, String location,double incentive, double target, double acheivedTarget, double basicSalary, double hra,double bonus) {
        super(id, firstName, lastName, email, contactNumber, location, incentive, target, acheivedTarget, basicSalary, hra);
        this.bonus=bonus;
    }
        
    @Override
    public void doWork(){
        System.out.println(firstName+"is managing the sales team and strategy");
    }
    
    @Override
    public double computePay(){
        return super.computePay()+bonus;
    }
}
