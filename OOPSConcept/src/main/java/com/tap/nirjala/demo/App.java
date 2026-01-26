package com.tap.nirjala.demo;

import com.tap.nirjala.demo.HR.Interfaces.IAppraisable;
import com.tap.nirjala.demo.HR.Interfaces.IBonusEligible;
import com.tap.nirjala.demo.HR.Interfaces.IInterviewPanel;
import com.tap.nirjala.demo.HR.Interfaces.ITrainer;
import com.tap.nirjala.demo.HR.SalesEmployee;
import com.tap.nirjala.demo.HR.SalesManager;

public class App {
    public static void main(String[] args) {

        SalesManager manager = new SalesManager(2,"Nirjala","Naik","nirjalanaik1706.com","7972520102","Pune",1500, 7000, 30000, 200000, 250000, 10000);
        SalesEmployee sales=new SalesEmployee(2, "Sahil", "Kamble", "sahilkamble@gmail.com", "7972542628", "Satara", 0, 0, 0, 0, 0);
        manager.doWork();
        System.out.println(manager);
        System.out.println(sales);
        System.out.println("Salary: " + manager.computePay());
        
        IAppraisable appraisable=manager;
        appraisable.ConductAppraisal();

        IBonusEligible bonusEligible=manager;
        bonusEligible.CalculateBonus();
        
        IInterviewPanel panel=manager;
        panel.TakeInterview();

        ITrainer trainer=manager;
        trainer.Train();
        
    }
}
