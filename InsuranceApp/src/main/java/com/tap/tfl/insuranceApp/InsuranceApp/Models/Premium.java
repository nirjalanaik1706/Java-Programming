package com.tap.tfl.insuranceApp.InsuranceApp.Models;


import java.time.LocalDateTime;

public class Premium{
    private int premiumId;
    private int policyId;
    private String policyNumber;
    private int customerId;
    private String customerName;
    private float amountPaid;
    private LocalDateTime paymentDate;
    private String paymentMode;
    private String transactionId;
    private String paymentFrequency;
    public String paymentStatus;
    public String remarks;

    public int getPremiumId() {
    return premiumId;
}

public void setPremiumId(int premiumId) {
    this.premiumId = premiumId;
}

// policyId
public int getPolicyId() {
    return policyId;
}

public void setPolicyId(int policyId) {
    this.policyId = policyId;
}

// policyNumber
public String getPolicyNumber() {
    return policyNumber;
}

public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
}

// customerId
public int getCustomerId() {
    return customerId;
}

public void setCustomerId(int customerId) {
    this.customerId = customerId;
}

// customerName
public String getCustomerName() {
    return customerName;
}

public void setCustomerName(String customerName) {
    this.customerName = customerName;
}

// amountPaid
public float getAmountPaid() {
    return amountPaid;
}

public void setAmountPaid(float amountPaid) {
    this.amountPaid = amountPaid;
}

// paymentDate
public LocalDateTime getPaymentDate() {
    return paymentDate;
}

public void setPaymentDate(LocalDateTime paymentDate) {
    this.paymentDate = paymentDate;
}

// paymentMode
public String getPaymentMode() {
    return paymentMode;
}

public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
}

// transactionId
public String getTransactionId() {
    return transactionId;
}

public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
}

// paymentFrequency
public String getPaymentFrequency() {
    return paymentFrequency;
}

public void setPaymentFrequency(String paymentFrequency) {
    this.paymentFrequency = paymentFrequency;
}

// paymentStatus
public String getPaymentStatus() {
    return paymentStatus;
}

public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
}

// remarks
public String getRemarks() {
    return remarks;
}

public void setRemarks(String remarks) {
    this.remarks = remarks;
}

}
