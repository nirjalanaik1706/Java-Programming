package com.tap.tfl.insuranceApp.InsuranceApp.Departments;

import com.tap.tfl.insuranceApp.InsuranceApp.Models.Policy;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Employee;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Customer;
import com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.SalesAgents.SalesListener;


public class SalesDepartment implements SalesListener {

    @Override
    public void OnPolicyPurchased(Policy policy)
    {
        System.out.println(policy+"Policy Sold  " );
    } 

    //  // Lead Management
    //     public void GenerateLead(Customer customer)
    //     {
    //     }

    //     public void FollowUpLead(int leadId)
    //     {
    //     }

    //     public void ConvertLeadToCustomer(int leadId)
    //     {
    //     }

    //     // Policy Sales
    //     public void CreateQuotation(Customer customer)
    //     {
    //     }

    //     public void CalculatePremium(Policy policy)
    //     {
    //     }

    //     public void RecommendPolicy(Customer customer)
    //     {
    //     }

    //     public void SellPolicy(Customer customer, Policy policy)
    //     {
    //     }

    //     public void CancelQuotation(int quotationId)
    //     {
    //     }

    //     // Customer Communication
    //     public void SendPromotionalOffer(Customer customer)
    //     {
    //     }

    //     public void NotifyRenewal(Customer customer, Policy policy)
    //     {
    //     }

    //     public void SendWelcomeEmail(Customer customer)
    //     {
    //     }

    //     // Agent Operations
    //     public void AssignSalesAgent(Customer customer, Employee agent)
    //     {
    //     }

    //     public void ViewSalesPerformance(Employee agent)
    //     {
    //     }

    //     public void UpdateSalesTarget(Employee agent, float targetAmount)
    //     {
    //     }

    //     // Renewals
    //     public void ProcessPolicyRenewal(Policy policy)
    //     {
    //     }

    //     public void GenerateRenewalQuote(Policy policy)
    //     {
    //     }

    //     // Campaign Management
    //     public void LaunchMarketingCampaign(String campaignName)
    //     {
    //     }

    //     public void SendBulkNotifications(String message)
    //     {
    //     }

    //     // Reports
    //     public void GenerateDailySalesReport()
    //     {
    //     }

    //     public void GenerateMonthlySalesReport()
    //     {
    //     }

    //     public void GenerateRevenueReport()
    //     {
    //     }

    //     public void GenerateTopSellingPoliciesReport()
    //     {
    //     }

    //     // Customer Analytics
    //     public void GetCustomerPurchaseHistory(int customerId)
    //     {
    //     }

    //     public void GetSalesStatistics()
    //     {
    //     }
        
}