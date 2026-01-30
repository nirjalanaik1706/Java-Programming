package com.tap.nirjala.demo;

//outer class 
public class HRDepartment{
    final int leave=30;
    static String companyName="Transflower learning Pvt.Ltd"; //non-static variable(instance)

    //inner class 
    public static class Policy{
        int leaveDays=25;//static variable (instance variable)

        static void showPolicy(Policy p){
           // companyName="TFL";
            System.out.println("Company Name: "+ companyName);
            System.out.println("Total leave Days "+p.leaveDays);
        }
    }
    public void display(){
            System.out.println("Leave:"+leave);
        }
    
}
