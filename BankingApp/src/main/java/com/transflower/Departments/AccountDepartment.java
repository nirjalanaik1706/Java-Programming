package com.transflower.Departments;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.management.Notification;

import com.transflower.Listeners.AccountListener;
import com.transflower.Models.Accounts;
import com.transflower.Models.Operation;

import com.transflower.Repositories.AccountRepository;
import com.transflower.Services.EmailService;
import com.transflower.Services.NotificationService;
import com.transflower.Services.SMSService;

public class AccountDepartment {

    AccountRepository accountRepository = new AccountRepository();
    List<Accounts> accounts = accountRepository.getAll();
    SMSService service = new SMSService();
    EmailService email=new EmailService();
    List<AccountListener> listeners = new ArrayList<>();


    public void getAll() {
        for (Accounts a : accounts) {
            System.out.println(a.getOperationId() + "  " + a.getName() + "  " + a.getAccountNumber() + "  " + a.getAmount());
        }
    }

    public void checkBalance(long accountNumber) {
        for (Accounts a : accounts) {
            if (a.getAccountNumber() == accountNumber) {
                System.out.println(a.getName() + " Your bank balance is :" + a.getAmount());
                balanceStatus(a);

                return;
            }

        }
    }

    public void addUser(int operationId, String name, double amount, long accountNumber) throws IOException {
        System.out.println("User added");
        Accounts acc = new Accounts(operationId, name, amount, accountNumber);
        accounts.add(acc);
        accountRepository.save(accounts);
    }

    public boolean deposit(long Account_number, double amount) throws IOException {
        for (Accounts a : accounts) {
            if (a.getAccountNumber() == Account_number) {
                a.setAmount(a.getAmount() + amount);
                System.out.println(a.getName() + " your updated balance:" + a.getAmount());
                balanceStatus(a);
                accountRepository.save(accounts);
                return true;

            }
        }
        return false;
    }

    public boolean withdraw(long Account_number, double amount) throws IOException {
        for (Accounts a : accounts) {
            if (a.getAccountNumber() == Account_number) {
                a.setAmount(a.getAmount() - amount);
                System.out.println(a.getName() + "your updated balance:" + a.getAmount());
                balanceStatus(a);
                accountRepository.save(accounts);
                return true;
            }
        }
        return false;
    }

    public boolean fundTransfer(Long fromAccNumber, Long toAccNumber, double amount) throws IOException {
        boolean withdrawStatus = false, depositeStatus = false;
        for (Accounts a : accounts) {
            if (a.getAccountNumber().equals(fromAccNumber)) {
                withdrawStatus = withdraw(fromAccNumber, amount);
            }
        }
        if (withdrawStatus == true) {
            for (Accounts a : accounts) {
                if (a.getAccountNumber().equals(fromAccNumber)) {
                    depositeStatus = deposit(toAccNumber, amount);
                }
            }
        }
        if (withdrawStatus && depositeStatus) {
            List<Operation> operations = accountRepository.getAllOperation();
            Operation operation1 = new Operation(fromAccNumber, "D", "withdraw " + amount + " from " + fromAccNumber + " deposite to " + toAccNumber, LocalDateTime.now().toString());
            Operation operation2 = new Operation(toAccNumber, "C", "deposite " + amount + " in " + toAccNumber + " from " + fromAccNumber, LocalDateTime.now().toString());
            operations.add(operation1);
            operations.add(operation2);
            accountRepository.saveOperation(operations);

            return true;
        }
        return false;

    }

    public void balanceStatus(Accounts account) {
        if (account.getAmount() < 1000) {
            for (AccountListener l : listeners) {
                l.onUnderBalance(account.getAmount());
                service.send("Amount is less than 1000");
                email.send("Please keep your balance over 1000");
            }
        }
        if (account.getAmount() > 25000) {
            for (AccountListener l : listeners) {
                l.onOverBalance(account.getAmount());
                service.send("Amount is more than 25000");
                email.send("Please keep Your balance under 25000");
            }
        }
    }

    public void addListener(AccountListener listener) {
        listeners.add(listener);
    }
}
