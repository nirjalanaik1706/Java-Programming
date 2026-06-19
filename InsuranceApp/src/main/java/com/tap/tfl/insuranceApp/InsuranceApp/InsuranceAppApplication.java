package com.tap.tfl.insuranceApp.InsuranceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;

import com.tap.tfl.insuranceApp.InsuranceApp.Departments.ClaimsDepartment;
import com.tap.tfl.insuranceApp.InsuranceApp.Departments.RenewalDepartment;
import com.tap.tfl.insuranceApp.InsuranceApp.Departments.SalesDepartment;
import com.tap.tfl.insuranceApp.InsuranceApp.Managers.ClaimsManager;
import com.tap.tfl.insuranceApp.InsuranceApp.Managers.InsurancePolicyManager;
import com.tap.tfl.insuranceApp.InsuranceApp.Services.EmailNotificationService;

@SpringBootApplication
public class InsuranceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceAppApplication.class, args);

		
	}

	

}
