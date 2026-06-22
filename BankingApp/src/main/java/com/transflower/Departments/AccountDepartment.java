package com.transflower.Departments;

import java.util.List;

import com.transflower.Listeners.AccountListener;
import com.transflower.Models.Account;
import com.transflower.Models.Operation;

public interface AccountDepartment {
    public void getAll();
    public void getBalance(String accountNumber);
    public void addUser(String name, double balance, String accountNumber,String date);
    public boolean deposit(String Account_number, double balance);
    public boolean withdraw(String Account_number, double balance);
    public boolean fundTransfer(String fromAccNumber, String toAccNumber, double balance);
    public void checkBalance(Account account);
    public void addListener(AccountListener listener);
    public List<Operation> getMiniStatement(String accountNumber);
}
