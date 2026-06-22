package com.transflower.Models;

import java.time.LocalDateTime;
import java.util.Date;

public class Operation {

    private double  amount;
    private String accountNumber;
    private String status;
    private String date;
    
    public Operation() {

    }

    public Operation(double  amount,String accountNumber, String status, String date) {
        this.amount=amount;
        this.accountNumber = accountNumber;
        this.status = status;
        this.date=date;
        
    }


    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
