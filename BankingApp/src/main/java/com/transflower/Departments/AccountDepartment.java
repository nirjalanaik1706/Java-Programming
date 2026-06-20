package com.transflower.Departments;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.transflower.Models.Accounts;
import com.transflower.Models.Operation;

import com.transflower.Repositories.AccountRepository;

public class AccountDepartment {

    AccountRepository accountRepository = new AccountRepository();
    List<Accounts> accounts = accountRepository.getAll();

    public void getAll() {
        for (Accounts a : accounts) {
            System.out.println(a.getOperationId() + "  " + a.getName() + "  " + a.getAccountNumber() + "  " + a.getAmount());
        }
    }

    public void checkBalance(long accountNumber) {
        for (Accounts a : accounts) {
            if (a.getAccountNumber() == accountNumber) {
                System.out.println(a.getAmount());
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

}
