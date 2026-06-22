package com.transflower.Departments;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.management.Notification;

import com.transflower.Listeners.AccountListener;
import com.transflower.Models.Account;
import com.transflower.Models.Operation;

import com.transflower.Repositories.AccountRepositoryImpl;
import com.transflower.Services.EmailService;
import com.transflower.Services.NotificationService;
import com.transflower.Services.SMSService;

public class AccountDepartmentImpl implements AccountDepartment {

    private NotificationService service;

    public AccountDepartmentImpl(NotificationService notificationService) {
        this.service = notificationService;

    }

    AccountRepositoryImpl accountRepository = new AccountRepositoryImpl();
    List<Account> account = accountRepository.getAll();
    List<Operation> operation=accountRepository.getAllOperation();
    List<AccountListener> listeners = new ArrayList<>();
    NotificationService sms=new SMSService();
    NotificationService email=new EmailService();

    @Override
    public void getAll() {
        for (Account a : account) {
            System.out.println(a.getName() + "  " + a.getAccountNumber() + "  " + a.getBalance());
        }
    }

    @Override
    public void getBalance(String accountNumber) {
        for (Account a : account) {
            if (a.getAccountNumber().equals(accountNumber)) {
                System.out.println(a.getName() + " Your bank balance is :" + a.getBalance());
                checkBalance(a);

                return;
            }

        }
    }

    @Override
    public void addUser(String name, double balance, String accountNumber, String date) {
        try {
            System.out.println("User added");
            Account acc = new Account(name, balance, accountNumber, LocalDateTime.now().toString());
            account.add(acc);
            accountRepository.save(account);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public boolean deposit(String Account_number, double amount) {
        try {
            for (Account a : account) {
                if (a.getAccountNumber().equals(Account_number)) {
                    a.setBalance(a.getBalance() + amount);
                    System.out.println(a.getName() + " your updated balance:" + a.getBalance());
                    checkBalance(a);
                    service.send(a.getName()+ "  amount has been sussessfully credited");
                    accountRepository.save(account);
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public boolean withdraw(String Account_number, double balance) {
        for (Account a : account) {
            if (a.getAccountNumber().equals(Account_number)) {
                a.setBalance(a.getBalance() - balance);
                System.out.println(a.getName() + "your updated balance:" + a.getBalance());
                checkBalance(a);
                service.send(a.getName()+ " amount has been sussessfully debited");
                accountRepository.save(account);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean fundTransfer(String fromAccNumber, String toAccNumber, double balance) {

        boolean withdrawStatus = false, depositeStatus = false;
        for (Account a : account) {
            if (a.getAccountNumber().equals(fromAccNumber)) {
                withdrawStatus = withdraw(fromAccNumber, balance);
            }
        }
        if (withdrawStatus == true) {
            for (Account a : account) {
                if (a.getAccountNumber().equals(fromAccNumber)) {
                    depositeStatus = deposit(toAccNumber, balance);
                }
            }
        }
        if (withdrawStatus && depositeStatus) {
            List<Operation> operations = accountRepository.getAllOperation();
            Operation operation1 = new Operation(balance, fromAccNumber, "D", LocalDate.now().toString());
            Operation operation2 = new Operation(balance, toAccNumber, "C", LocalDate.now().toString());
            operations.add(operation1);
            operations.add(operation2);
            accountRepository.saveOperation(operations);

            return true;
        }
        return false;

    }

    @Override
    public List<Operation>  getMiniStatement(String accountNumber) {
        List<Operation> statements=new ArrayList<>();
        operation=accountRepository.getAllOperation();
        int count=0;
        for(Operation o:operation){
            if(o.getAccountNumber().equals(accountNumber)){
                statements.add(o);
                count++;
                if(count==5){
                    break;
                }
            }
        }
        return statements;
    }

    @Override
    public void checkBalance(Account account) {
        if (account.getBalance() < 1000) {
            for (AccountListener l : listeners) {
                l.onUnderBalance(account.getBalance());
                sms.send("Amount is less than 1000");
                email.send("Please keep your balance above 1000");
                
            }
        }
        if (account.getBalance() > 25000) {
            for (AccountListener l : listeners) {
                l.onOverBalance(account.getBalance());
                sms.send("Amount is more than 25000");
                email.send("Please keep Your balance under 25000");
            }
        }
    }

    public void addListener(AccountListener listener) {
        listeners.add(listener);
    }
}
