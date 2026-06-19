package com.tap.tfl.insuranceApp.InsuranceApp.Managers;
import java.util.ArrayList;
import java.util.List;

import com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.ClaimAgents.ClaimListener;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;

public class ClaimsManager {

    private List<ClaimListener> listener=new ArrayList<>();
    ClaimListener claimListener;
   

    public void invoke(){
        for(ClaimListener l : listener){
            l.OnClaimRegistered(Claim claim);
        }
    }

    public void RegisterClaim(Claim claim){
        invoke();
    }

    
    }

    public void addListener(ClaimListener l){
        listener.add(l);
    }


    
}
