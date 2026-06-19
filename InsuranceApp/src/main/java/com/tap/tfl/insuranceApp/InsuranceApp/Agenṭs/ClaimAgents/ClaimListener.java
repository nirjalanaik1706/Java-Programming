package com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.ClaimAgents;

import java.util.List;

import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;

public interface ClaimListener { 
    public void OnClaimRegistered(Claim claim);
    // public void OnClaimVerified(Claim claim);
    public void OnClaimApproved(Claim claim);
    public void OnClaimRejected(Claim claim);
    public void OnClaimSettled(Claim claim);
    // public void OnFraudCheckRequested(Claim claim);
    // public void OnClaimReopened(Claim claim);
    // public void OnClaimClosed(Claim claim);
    // public Claim GetAllClaims();
    // public Claim GetClaimById(int claimId);
    // public Claim GetClaimByPolicyNumber(String policyNumber);
    // public boolean VerifyDocuments(int claimId);
    // public boolean ValidatePolicy(int claimId);
    // public void AssignSurveyor(int claimId, String surveyorName);
    // public float CalculateClaimAmount(int claimId);
    // public void ApproveClaim(int claimId);
    // public void RejectClaim(int claimId, String reason);
    // public void StartInvestigation(int claimId);
    // public void CompleteInvestigation(int claimId);
    // public void SettleClaim(int claimId);
    // public void CancelClaim(int claimId);
    // public void UpdateClaim(Claim claim);
    // public void DeleteClaim(int claimId);
    // public List<Claim> GetClaimsByCustomer(int customerId);
    // public List<Claim> GetClaimsByPolicy(int policyId);
    // public List<Claim> GetPendingClaims();
    // public List<Claim> GetApprovedClaims();
    // public List<Claim> GetRejectedClaims();
    // public void GenerateClaimReport();
    // public void NotifyCustomer(int claimId);




}
