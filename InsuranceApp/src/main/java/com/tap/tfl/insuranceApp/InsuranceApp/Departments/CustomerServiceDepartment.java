package com.tap.tfl.insuranceApp.InsuranceApp.Departments;

import com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.CustomerAgents.CustomerListener;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Customer;


public class CustomerServiceDepartment implements CustomerListener {
    @Override
    public void OnCustomerRegistered(Customer customer)
    {
        System.out.println("====================================");
        System.out.println("Customer Service Department");
        System.out.println("Customer:"+customer.getFullName() + customer.getLastName()+" registered successfully.");
        System.out.println("Welcome email and onboarding process initiated.");
        System.out.println("====================================");
    }

    // @Override
    // public void OnCustomerUpdated(Customer customer)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Customer profile updated.");
    //     System.out.println("Customer:"+customer.getFullName() + customer.getLastName());
    //     System.out.println("====================================");
    // }

    // @Override
    // public void OnCustomerDeactivated(int customerId)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Customer with Id {customerId} has been deactivated.");
    //     System.out.println("====================================");
    // }

    // @Override
    // public void OnPolicyDocumentSent(String policyNumber)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Policy document sent for Policy No: "+policyNumber);
    //     System.out.println("====================================");
    // }

    // @Override
    // public void OnRenewalReminderSent(String policyNumber)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Renewal reminder sent for Policy No:"+policyNumber);
    //     System.out.println("====================================");
    // }

    // @Override
    // public void OnKycVerified(Customer customer)
    // {
    //     System.out.println("====================================");
    //     System.out.println("KYC verification completed for" +customer.getFullName() + customer.getLastName());
    //     System.out.println("====================================");
    // }

    // @Override
    // public void OnCustomerQueryRaised(String query)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Customer Query");
    //     System.out.println(query);
    //     System.out.println("Support ticket created successfully.");
    //     System.out.println("====================================");
    // }

    // @Override
    // public void OnFeedbackReceived(String feedback)
    // {
    //     System.out.println("====================================");
    //     System.out.println("Customer Feedback Received");
    //     System.out.println(feedback);
    //     System.out.println("====================================");
    // }
}
