package com.transflower.Models;

public class Account {

    
    private String name;
    private double balance;
    private String accountNumber;
    private String date;

    public Account() {

    }

    public Account(String name, double balance, String accountNumber,String date) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.date=date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date=date;
    }
}
