package com.tap.tfl.insuranceApp.InsuranceApp.Services;

import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Customer;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Premium;

public class SMSNotificationService {

    public void OnSmsSent(String message) {
        System.out.println("====================================");
        System.out.println("SMS SERVICE");
        System.out.println("SMS sent: " + message);
        System.out.println("Delivered successfully to mobile network.");
        System.out.println("====================================");
    }

    public void OnPolicyDocumentSent(String policyNumber) {
        System.out.println("====================================");
        System.out.println("SMS SERVICE - POLICY ALERT");
        System.out.println("Policy document notification sent for Policy No: " + policyNumber);
        System.out.println("SMS: Your policy document is now available.");
        System.out.println("====================================");
    }

    public void OnRenewalReminderSent(String policyNumber) {
        System.out.println("====================================");
        System.out.println("SMS SERVICE - RENEWAL REMINDER");
        System.out.println("Renewal reminder sent for Policy No: " + policyNumber);
        System.out.println("SMS: Your policy is due for renewal soon. Please renew to stay covered.");
        System.out.println("====================================");
    }

    public void OnPaymentReceived(Premium premium) {
        System.out.println("====================================");
        System.out.println("SMS SERVICE - PAYMENT CONFIRMATION");
        System.out.println("SMS sent to {premium.CustomerName}");
        System.out.println("Policy: " + premium.getPolicyNumber());
        System.out.println("Amount Received: " + premium.getAmountPaid());
        System.out.println("Transaction ID: " + premium.getTransactionId());
        System.out.println("SMS: Payment received successfully. Thank you!");
        System.out.println("====================================");
    }

    public void OnCustomerRegistered(Customer customer) {
        System.out.println("====================================");
        System.out.println("SMS SERVICE - WELCOME MESSAGE");
        System.out.println("Welcome SMS sent to " + customer.getFirstName() + customer.getLastName());
        System.out.println("Mobile: {customer.MobileNumber}");
        System.out.println("SMS: Welcome to Max Insurance. Your account is active.");
        System.out.println("====================================");
    }

    public void OnClaimStatusUpdate(Claim claim) {
        System.out.println("====================================");
        System.out.println("SMS SERVICE - CLAIM UPDATE");
        System.out.println("SMS sent to " + claim.getCustomerName());
        System.out.println("Claim ID: " + claim.getClaimId());
        System.out.println("Status: " + claim.getStatus());
        System.out.println("SMS: Your claim status has been updated.");
        System.out.println("====================================");
    }

    public void OnGenericSms(String mobileNumber, String message) {
        System.out.println("====================================");
        System.out.println("SMS SERVICE - GENERIC MESSAGE");
        System.out.println("To: " + mobileNumber);
        System.out.println("Message: " + message);
        System.out.println("SMS delivered successfully.");
        System.out.println("====================================");
    }
}
