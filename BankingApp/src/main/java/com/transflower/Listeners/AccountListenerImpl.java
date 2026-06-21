package com.transflower.Listeners;

public class AccountListenerImpl implements AccountListener {

    @Override
    public void onUnderBalance(double balance){
        System.out.println("Department ! current balance: "+balance);
    }

    @Override
    public void onOverBalance(double balance){
        System.out.println("Department ! current balance"+balance);
    }
    
}
