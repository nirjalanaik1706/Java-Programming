package com.tap.tfl.insuranceApp.InsuranceApp.Services;

import com.tap.tfl.insuranceApp.InsuranceApp.Models.Policy;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Employee;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Customer;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Premium;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;

public class EmailNotificationService {
    public void OnEmailSent(String message)
    {
        System.out.println("====================================");
        System.out.println("EMAIL SERVICE");
        System.out.println("Email sent with message: "+message);
        System.out.println("====================================");
    }

    public void OnPolicyDocumentSent(String policyNumber)
    {
        System.out.println("====================================");
        System.out.println("EMAIL SERVICE - POLICY DOCUMENT");
        System.out.println("Policy document emailed for Policy No: "+policyNumber);
        System.out.println("Attachment: Policy PDF generated and sent.");
        System.out.println("====================================");
    }

    public void OnRenewalReminderSent(String policyNumber)
    {
        System.out.println("====================================");
        System.out.println("EMAIL SERVICE - RENEWAL REMINDER");
        System.out.println("Renewal reminder email sent for Policy No: "+policyNumber);
        System.out.println("Message: Please renew your policy before expiry.");
        System.out.println("====================================");
    }

    public void OnPaymentReceiptGenerated(Premium premium)
    {
        System.out.println("====================================");
        System.out.println("EMAIL SERVICE - PAYMENT RECEIPT");
        System.out.println("Receipt emailed to Customer: "+premium.getCustomerName());
        System.out.println("Policy: "+premium.getPolicyNumber());
        System.out.println("Amount Paid: {premium.AmountPaid}");
        System.out.println("Transaction ID: {premium.TransactionId}");
        System.out.println("====================================");
    }

    public void OnCustomerWelcomeEmail(Customer customer)
    {
        System.out.println("====================================");
        System.out.println("EMAIL SERVICE - WELCOME EMAIL");
        System.out.println("Welcome email sent to: "+customer.getFirstName() +  customer.getLastName());
        System.out.println("Email: {customer.Email}");
        System.out.println("Onboarding instructions shared successfully.");
        System.out.println("====================================");
    }

    public void OnClaimStatusEmail(Claim claim)
    {
        System.out.println("====================================");
        System.out.println("EMAIL SERVICE - CLAIM STATUS UPDATE");
        System.out.println("Email sent to: "+claim.getCustomerName());
        System.out.println("Claim ID: {claim.ClaimId}");
        System.out.println("Status: {claim.Status}");
        System.out.println("====================================");
    }

    public void OnGenericNotification(String subject, String body)
    {
        System.out.println("====================================");
        System.out.println("EMAIL SERVICE - NOTIFICATION");
        System.out.println("Subject: "+subject);
        System.out.println("Body: "+body);
        System.out.println("Email delivered successfully.");
        System.out.println("====================================");
    }
}
