package com.tap.nirjala.demo.HR;

import com.tap.nirjala.demo.HR.Interfaces.IBonusEligible;
import com.tap.nirjala.demo.HR.Interfaces.IInterviewPanel;
import com.tap.nirjala.demo.HR.Interfaces.IManagerBenefits;
import com.tap.nirjala.demo.HR.Interfaces.ITrainer;

public class SalesManager extends SalesEmployee implements IManagerBenefits, IInterviewPanel, ITrainer, IBonusEligible {

    protected double bonus;

    public SalesManager(int id, String firstName, String lastName, String email, String contactNumber, String location, double incentive, double target, double acheivedTarget, double basicSalary, double hra, double bonus) {
        super(id, firstName, lastName, email, contactNumber, location, incentive, target, acheivedTarget, basicSalary, hra);
        this.bonus = bonus;
    }

    @Override
    public void doWork() {
        System.out.println(firstName + "is managing the sales team and strategy");
    }

    @Override
    public double computePay() {
        return super.computePay() + bonus;
    }

    @Override
    public float CalculateBonus() {
        System.out.println("mgr bonus");
        return 8000f;
    }

    @Override
    public void ConductAppraisal() {
        System.out.println("Manager appraisal completed.");
    }

    @Override
    public void ApproveLeave() {
        System.out.println("Leave approved by Sales Manager.");
    }

    @Override
    public void TakeInterview() {
        System.out.println("Sales Manager conducting interview.");
    }

    @Override
    public void Train() {
        System.out.println("Sales Manager training sales team.");
    }
}
