package com.transflower.Models;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.LongAccumulator;

public class Accounts{

    private int operationId;
    private String name;
    private double amount;
    private long accountNumber;
   
    public Accounts(){

    }
    public Accounts(int operationId,String name,double amount,long accountNumber){
        this.operationId=operationId;
        this.name=name;
        this.amount=amount;
        this.accountNumber=accountNumber;
    }

     public int getOperationId(){
        return operationId;
    }

    public void setOperationId(int operationId){
        this.operationId= operationId;
    }

   public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

     public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    public Long  getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

   

}
    