package com.tap.tfl.insuranceApp.InsuranceApp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tap.tfl.insuranceApp.InsuranceApp.Departments.AccountDepartment;
import com.tap.tfl.insuranceApp.InsuranceApp.Departments.ClaimsDepartment;
import com.tap.tfl.insuranceApp.InsuranceApp.Departments.RenewalDepartment;
import com.tap.tfl.insuranceApp.InsuranceApp.Departments.SalesDepartment;
import com.tap.tfl.insuranceApp.InsuranceApp.Managers.ClaimsManager;
import com.tap.tfl.insuranceApp.InsuranceApp.Managers.InsurancePolicyManager;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;
import com.tap.tfl.insuranceApp.InsuranceApp.Services.EmailNotificationService;

public class ClaimController {
    @PostMapping("/api/policies/registerclaim")
public String registerClaim(@RequestBody Claim claim) {
    ClaimsManager claimsManager=new ClaimsManager();
	
    // InsurancePolicyManager insuranceManager =new InsurancePolicyManager();
    // AccountDepartment accounts = new AccountDepartment();
    // SalesDepartment sales = new SalesDepartment();
    // ClaimsDepartment claims = new ClaimsDepartment();
    // RenewalDepartment renewals = new RenewalDepartment();
    // EmailNotificationService emailSvc = new EmailNotificationService();

    // insuranceManager.addListener(accounts);
    // insuranceManager.addPolicyListener(sales);
    // insuranceManager.addPolicyListener(renewals);
    // insuranceManager.addClaimListener(claims);
    
    claimsManager.addListener(new ClaimsDepartment());

    return "Claim is Registered";
}
}
