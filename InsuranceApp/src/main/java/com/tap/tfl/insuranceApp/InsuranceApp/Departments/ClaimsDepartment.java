package com.tap.tfl.insuranceApp.InsuranceApp.Departments;

import java.util.List;

import com.tap.tfl.insuranceApp.InsuranceApp.Agenṭs.ClaimAgents.ClaimListener;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Claim;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Customer;
import com.tap.tfl.insuranceApp.InsuranceApp.Models.Employee;

import io.micrometer.observation.annotation.Observed;

public class ClaimsDepartment implements ClaimListener{
    @Override
    public void OnClaimRegistered(Claim claim){
        System.out.println("===================================");
        System.out.println("Claims department");
        System.out.println("claim"+claim.getClaimId()+"registered successfully");
        System.out.println("Claim forwarded for verification");
        System.out.println("===================================");
    }

    // @Override
    // public void OnClaimVerified(Claim claim){
    //     System.out.println("==================================");
    //     System.out.println("Claim"+claim.getClaimId()+"has been verified");
    //     System.out.println("Supporting documents validated");
    //     System.out.println("==================================");
    // }

    @Override
    public void OnClaimApproved(Claim claim){
        System.out.println("=================================");
        System.out.println("Claim"+claim.getClaimId()+"approved");
        System.out.println("Settlement process initiated");
        System.out.println("=================================");
    }

    @Override
    public void OnClaimRejected(Claim claim){
        System.out.println("==================================");
        System.out.println("Claim"+claim.getClaimId()+"rejected");
        System.out.println("Customer will be notified with the reason");
        System.out.println("==================================");
    }

    @Override
    public void OnClaimSettled(Claim claim){
        System.out.println("==================================");
        System.out.println("Calim"+claim.getClaimId()+"settled successfully");
        System.out.println("Payment released to the customer");
        System.out.println("==================================");
    }

    // @Override
    // public void OnFraudCheckRequested(Claim claim){
    //     System.out.println("=================================");
    //     System.out.println("Fraud investigation initiated for Claim"+claim.getClaimId());
    //     System.out.println("Claim sent to the investigation team");
    // }

    // @Override
    // public void OnClaimReopened(Claim claim){
    //     System.out.println("=================================");
    //     System.out.println("Claim "+claim.getClaimId() +"has been reopened");
    //     System.out.println("The claim will be reviewed again.");
    //     System.out.println("=================================");
    // }

    // @Override
    // public void OnClaimClosed(Claim claim){
    //     System.out.println("================================");
    //     System.out.println("Claim"+claim.getClaimId()+" closed.");
    //     System.out.println("No further processing is pending.");
    //     System.out.println("================================");
    // }

    // @Override
    // // View all registered claims
    // public Claim GetAllClaims()
    // {
    //     return null;
    // }

    // // Find claim by Id
    // @Override
    // public Claim GetClaimById(int claimId)
    // {
    //     return null;
    // }

    // // Find claim by policy number
    // @Override
    // public Claim GetClaimByPolicyNumber(String policyNumber)
    // {
    //     return null;
    // }

    // // Verify submitted documents
    // @Override
    // public boolean VerifyDocuments(int claimId)
    // {
    //     return false;
    // }

    // // Validate policy eligibility
    // @Override
    // public boolean ValidatePolicy(int claimId)
    // {
    //     return false;
    // }

    // // Assign surveyor/investigator
    // @Override
    // public void AssignSurveyor(int claimId, String surveyorName)
    // {
    // }

    // // Calculate approved claim amount
    // @Override
    // public float CalculateClaimAmount(int claimId)
    // {
    //     return 0;
    // }

    // // Approve claim
    // @Override
    // public void ApproveClaim(int claimId)
    // {
    // }

    // // Reject claim
    // @Override
    // public void RejectClaim(int claimId, String reason)
    // {
    // }

    // // Mark claim as under investigation
    // @Override
    // public void StartInvestigation(int claimId)
    // {
    // }

    // // Complete investigation
    // @Override
    // public void CompleteInvestigation(int claimId)
    // {
    // }

    // // Settle claim payment
    // @Override
    // public void SettleClaim(int claimId)
    // {
    // }

    // // Cancel claim
    // @Override
    // public void CancelClaim(int claimId)
    // {
    // }

    // // Update claim details
    // @Override
    // public void UpdateClaim(Claim claim)
    // {
    // }

    // // Delete claim record
    // @Override
    // public void DeleteClaim(int claimId)
    // {
    // }

    // // Get claims by customer
    // @Override
    // public List<Claim> GetClaimsByCustomer(int customerId)
    // {
    //     return  null;
    // }

    // // Get claims by policy
    // @Override
    // public List<Claim> GetClaimsByPolicy(int policyId)
    // {
    //     return null;
    // }

    // // Get pending claims
    // @Override
    // public List<Claim> GetPendingClaims()
    // {
    //     return null;
    // }

    // // Get approved claims
    // @Override
    // public List<Claim> GetApprovedClaims()
    // {
    //     return null;
    // }

    // // Get rejected claims
    // @Override
    // public List<Claim> GetRejectedClaims()
    // {
    //     return null;
    // }

    // // Generate claim summary report
    // @Override
    // public void GenerateClaimReport()
    // {
    // }

    // // Notify customer about claim status
    // @Override
    // public void NotifyCustomer(int claimId)
    // {
    // }
}
