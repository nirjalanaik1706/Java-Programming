package com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.AccountAgents;

import java.time.LocalDateTime;

import com.tap.tfl.insuranceApp.InsuranceApp.Models.Agent;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Policy;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Premium;

public interface AccountListener {
    
    public void OnPolicyPurchased(Policy policy);
    public void OnPremiumPaid(Premium premium);
    // public void OnPremiumRefunded(Premium premium);
    public void OnClaimApproved(Claim claim);
    public void OnClaimSettled(Claim claim);
    // public void OnAgentCommissionCalculated(Agent agent);
    public void OnPaymentReceiptGenerated(Premium premium);
    // public void OnLateFeeApplied(String policyNumber);
    // public void OnDailyReportGenerated(LocalDateTime reportDate);
    // public void OnMonthlyReportGenerated(LocalDateTime reportDate);

}
