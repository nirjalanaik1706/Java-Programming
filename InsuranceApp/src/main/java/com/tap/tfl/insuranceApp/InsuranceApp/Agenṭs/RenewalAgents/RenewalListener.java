package com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.RenewalAgents;

import com.tap.tfl.insuranceApp.InsuranceApp.Models.Policy;


public interface RenewalListener {
    public void OnRenewPolicy(String policyNumber);
    public void OnRenewalReminderSent(String policyNumber);
    // public void OnPolicyExpired(String policyNumber);
    // public void OnRenewalCompleted(Policy policy);
    // public void OnRenewalRejected(String policyNumber);
    // public void OnPremiumDue(String policyNumber);

    
}
