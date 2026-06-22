package com.transflower;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.transflower.Departments.AccountDepartmentImpl;
import com.transflower.Listeners.AccountListenerImpl;
import com.transflower.Managers.UIManager;
import com.transflower.Models.Account;
import com.transflower.Models.Operation;
import com.transflower.Services.NotificationService;
import com.transflower.Services.SMSService;

public class App {

    public static void main(String[] args) throws Exception {

        UIManager manager = new UIManager();
        manager.displayMenu();
        Account account = new Account();
        // AccountDepartment acc=new AccountDepartment();
        // acc.addListener(new AccountListenerImpl());

        NotificationService smsService = new SMSService();
        AccountDepartmentImpl dept = new AccountDepartmentImpl(smsService);
        dept.addListener(new AccountListenerImpl());
        List<Operation>op=new ArrayList<>();
        
        
        while(true){
            System.out.println("==============================");
            int choice = manager.getChoice("Enter your choice...!!!!");
            switch (choice) {

                case 1: {
                    dept.getAll();
                    break;
                }

                case 2: {
                    String accountNumber = manager.getAccountNumber("Enter Account Number: ");
                    dept.getBalance(accountNumber);
                    break;
                }

                case 3: {
                    String name = manager.getName("Enter Your Name: ");
                    double amount = manager.getBalance("Enter Amount: ");
                    String accountNumber = manager.getAccountNumber("Enter Account Number: ");
                    dept.addUser(name, amount, accountNumber, LocalDateTime.now().toString());
                    break;
                }

                case 4: {
                    String accountNumber = manager.getAccountNumber("Enter Account Number");
                    double balance = manager.getBalance("Enter amount to deposite" + account.getName());
                    dept.deposit(accountNumber, balance);
                    break;
                }

                case 5: {
                    String accountNumber = manager.getAccountNumber("Enter Account Number " + account.getName());
                    double balance = manager.getBalance("Enter amount to withdraw dear: " + account.getName());
                    dept.withdraw(accountNumber, balance);
                    break;
                }

                case 6:
                    String fromAccNumber = manager.getAccountNumber("Enter Your Accounts Number ");
                    String toAccNumber = manager.getAccountNumber("Enter Receivers Account Number");
                    double balance = manager.getBalance("Enter Amount To Send");
                    boolean status = dept.fundTransfer(fromAccNumber, toAccNumber, balance);
                    if (status) {
                        System.out.println("Fund transfer successfully...!!!");
                    } else {
                        System.out.println("Fund not transfer successfully...!!!");
                    }
                    break;

                case 7:
                    String accountNumber=manager.getAccountNumber("Enter account Number: ");
                    op=dept.getMiniStatement(accountNumber);
                    for(Operation o :op ){
                        System.out.println("Amount"+"               |                "+"Status"+"               |                "+"Date"+"               |                ");
                        System.out.println(".................................................................................................................");
                        System.out.println(o.getAmount()+"               |                "+o.getStatus()+"               |                    "+o.getDate()+"               |                ");
                    }
                    break;

                case 8:
                    System.exit(0);
                    break;

            }
        }
    }
}
