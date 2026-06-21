package com.transflower;

import java.util.*;

import com.transflower.Departments.AccountDepartment;
import com.transflower.Listeners.AccountListenerImpl;
import com.transflower.Managers.UIManager;
import com.transflower.Models.Accounts;

public class App {

    public static void main(String[] args) throws Exception {

        
        UIManager manager = new UIManager();
        manager.displayMenu();
        Accounts account = new Accounts();
        // AccountDepartment acc=new AccountDepartment();
        // acc.addListener(new AccountListenerImpl());

        AccountDepartment dept = new AccountDepartment();
        dept.addListener(new AccountListenerImpl());

        while (true) {

            int choice = manager.getChoice("Enter your choice...!!!!");

            switch (choice) {

                case 1: {
                    dept.getAll();
                    break;
                }

                case 2: {
                    long accountNumber = manager.getAccountNumber("Enter Account Number: ");
                    dept.checkBalance(accountNumber);
                    break;
                }

                case 3: {
                    int operationId = manager.getId("Enter Operation Id: ");
                    String name = manager.getName("Enter Your Name: ");
                    double amount = manager.getAmount("Enter Amount: ");
                    long accountNumber = manager.getAccountNumber("Enter Account Number: ");
                    dept.addUser(operationId, name, amount, accountNumber);
                    break;
                }

                case 4: {
                    long accountNumber = manager.getAccountNumber("Enter Account Number");
                    double amount = manager.getAmount("Enter amount to deposite" + account.getName());
                    dept.deposit(accountNumber, amount);
                    break;
                }

                case 5: {
                    long accountNumber = manager.getAccountNumber("Enter Account Number " + account.getName());
                    double amount = manager.getAmount("Enter amount to withdraw dear: " + account.getName());
                    dept.withdraw(accountNumber, amount);
                    break;
                }

                case 6:
                    long fromAccNumber = manager.getAccountNumber("Enter Your Accounts Number ");
                    long toAccNumber = manager.getAccountNumber("Enter Receivers Account Number");
                    double amount = manager.getAmount("Enter Amount To Send");
                    boolean status = dept.fundTransfer(fromAccNumber, toAccNumber, amount);
                    if (status) {
                        System.out.println("Fund transfer successfully...!!!");
                    } else {
                        System.out.println("Fund not transfer successfully...!!!");
                    }
                    break;

                case 7:
                    System.exit(0);
                    break;

            }

        }
    }
}
