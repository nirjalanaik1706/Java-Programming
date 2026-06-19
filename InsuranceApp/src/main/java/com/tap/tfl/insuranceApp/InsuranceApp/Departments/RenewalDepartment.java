package com.tap.tfl.insuranceApp.InsuranceApp.Departments;

import com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.RenewalAgents.RenewalListener;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Policy;

public class RenewalDepartment implements RenewalListener {

    @Override
    public void OnRenewPolicy(String policyNumber){
        System.out.println("====================================");
        System.out.println("Renewal Department");
        System.out.println("Policy Renewal Requested:"+policyNumber);
        System.out.println("Checking policy validity...");
        // Simulated validation logic
        boolean isEligibleForRenewal = true;
        if (isEligibleForRenewal){
            System.out.println("Policy is eligible for renewal.");
            System.out.println("Renewal process initiated.");
        }
        else{
            System.out.println("Policy is not eligible for renewal.");
        }
        System.out.println("====================================");
    }

    @Override
    public void OnRenewalReminderSent(String policyNumber)
    {
        System.out.println("====================================");
        System.out.println("Renewal Reminder Service");
        System.out.println("Reminder sent for Policy:"+policyNumber);
        System.out.println("Customer notified via Email/SMS.");
        System.out.println("====================================");
    }

    // public void OnPolicyExpired(String policyNumber)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Policy Expiry Handler");
    //     System.out.println("Policy expired: "+policyNumber);
    //     System.out.println("Grace period started (if applicable).");
    //     System.out.println("====================================");
    // }

    // public void OnRenewalCompleted(Policy policy)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Renewal Completed");
    //     System.out.println("Policy Renewed:"+policy.getPolicyNumber());
    //     System.out.println("New policy term activated.");
    //     System.out.println("====================================");
    // }

    // public void OnRenewalRejected(String policyNumber)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Renewal Rejected");
    //     System.out.println("Policy: "+policyNumber);
    //     System.out.println("Reason: Policy not eligible or payment pending.");
    //     System.out.println("====================================");
    // }

    // public void OnPremiumDue(String policyNumber)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Premium Due Alert");
    //     System.out.println("Policy: "+policyNumber);
    //     System.out.println("Payment reminder generated.");
    //     System.out.println("====================================");
    // }
}