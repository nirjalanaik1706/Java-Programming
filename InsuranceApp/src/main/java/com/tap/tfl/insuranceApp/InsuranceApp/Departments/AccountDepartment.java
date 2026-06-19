package com.tap.tfl.insuranceApp.InsuranceApp.Departments;

import java.time.LocalDate;
import java.time.LocalDateTime;


import com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.AccountAgents.AccountListener;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Policy;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Premium;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Agent;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Customer;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Employee;

public class AccountDepartment implements AccountListener {

    @Override
    public void OnPolicyPurchased(Policy policy) {
        System.out.println("====================================");
        System.out.println("Accounts Department");
        System.out.println("New policy purchased: " + policy.getPolicyNumber());
        System.out.println("Financial records updated.");
        System.out.println("====================================");
    }

    @Override
    public void OnPremiumPaid(Premium premium) {
        System.out.println("======================================");
        System.out.println("Premium Payment Received");
        System.out.println("Policy Id:" + premium.getPolicyId());
        System.out.println("Amount Paid:" + premium.getAmountPaid());
        System.out.println("Payment Mode: " + premium.getPaymentMode());
        System.out.println("Payment recorded successfully: ");
        System.out.println("======================================");
    }

    // @Override
    // public void OnPremiumRefunded(Premium premium) {
    //     System.out.println("======================================");
    //     System.out.println("Policy Refunded ");
    //     System.out.println("Policy id: " + premium.getPolicyId());
    //     System.out.println("Refund Amount: " + premium.getAmountPaid());
    //     System.out.println("Refund processed successfully.");
    //     System.out.println("======================================");
    // }

    @Override
    public void OnClaimApproved(Claim claim) {
        System.out.println("=======================================");
        System.out.println("Claim Approved");
        System.out.println("Claim Id" + claim.getClaimId());
        System.out.println("Awaiting settlement");
        System.out.println("======================================");
    }

    @Override
    public void OnClaimSettled(Claim claim) {
        System.out.println("=====================================");
        System.out.println("Claim Settlement");
        System.out.println("Claim Id: " + claim.getClaimId());
        System.out.println("Approved Amount :" + claim.getApprovedAmount());
        System.out.println("Settlement Payment released");
        System.out.println("=====================================");
    }

    // @Override
    // public void OnAgentCommissionCalculated(Agent agent) {
    //     System.out.println("======================================");
    //     System.out.println("Agent Commission");
    //     System.out.println("Agent: " + agent.getFullName());
    //     System.out.println("commission rate: " + agent.getCommissionRate());
    //     System.out.println("Total Earned" + agent.getTotalCommissionEarned());
    //     System.out.println("========================================");
    // }

    @Override
    public void OnPaymentReceiptGenerated(Premium premium) {
        System.out.println("=====================================");
        System.out.println("Payment Receipent");
        System.out.println("Policy Id:" + premium.getPolicyId());
        System.out.println("Amount:" + premium.getAmountPaid());
        System.out.println("Receipt generated successfully");
        System.out.println("=====================================");
    }

    // @Override
    // public void OnLateFeeApplied(String policyNumber) {
    //     System.out.println("======================================");
    //     System.out.println("Late Payment fee applied to policy" + policyNumber);
    //     System.out.println("======================================");
    // }

    // @Override
    // public void OnDailyReportGenerated(LocalDateTime reportDate) {
    //     System.out.println("======================================");
    //     System.out.println("Daily financial report generated on :" + reportDate);
    //     System.out.println("======================================");
    // }

    // @Override
    // public void OnMonthlyReportGenerated(LocalDateTime reportDate) {
    //     System.out.println("======================================");
    //     System.out.println("Monthly financial report generated for:" + reportDate);
    //     System.out.println("======================================");
    // }

}
