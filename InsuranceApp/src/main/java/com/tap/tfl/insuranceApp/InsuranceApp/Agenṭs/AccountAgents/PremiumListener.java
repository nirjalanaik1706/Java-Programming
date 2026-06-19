package com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.AccountAgents;

import com.tap.tfl.insuranceApp.InsuranceApp.Models.Premium;

public interface  PremiumListener {

    public void OnPremiumPaid(Premium premium);
    public void OnPremiumRefunded(Premium premium);
    
}
