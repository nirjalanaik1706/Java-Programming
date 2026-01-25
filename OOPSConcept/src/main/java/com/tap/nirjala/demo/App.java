package com.tap.nirjala.demo;

import com.tap.nirjala.demo.HR.Interfaces.IAppraisable;
import com.tap.nirjala.demo.HR.Interfaces.IBonusEligible;
import com.tap.nirjala.demo.HR.Interfaces.IInterviewPanel;
import com.tap.nirjala.demo.HR.Interfaces.ITrainer;
import com.tap.nirjala.demo.HR.SalesManager;

public class App {
    public static void main(String[] args) {

        SalesManager manager = new SalesManager(2,"Neha","Patil","neha@company.com","8888888888","Pune",1500, 7000, 30000, 200000, 250000, 10000);
        manager.doWork();
        System.out.println(manager);
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
 