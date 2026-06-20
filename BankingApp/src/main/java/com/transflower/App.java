package com.transflower;

import java.util.*;
import java.util.function.LongBinaryOperator;

import com.transflower.Departments.AccountDepartment;
import com.transflower.Managers.UIManager;
import com.transflower.Models.Accounts;
import com.transflower.Repositories.AccountRepository;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws Exception {
        AccountRepository accountRepository = new AccountRepository();
        UIManager manager = new UIManager();
        manager.displayMenu();
        Accounts acc = null;
        Scanner sc = new Scanner(System.in);

        while (true) {
            List<Accounts> accounts = accountRepository.getAll();
            AccountDepartment dept = new AccountDepartment();
            int choice = manager.getChoice();

            switch (choice) {

                case 1: {
                    dept.getAll();
                    break;
                }

                case 2: {
                    long accountNumber=manager.getAccountNumber();
                    dept.checkBalance(accountNumber);
                    break;
                }

                case 3: {
                    int operationId=manager.getId();
                    String name=manager.getName();
                    double amount=manager.getAmount();
                    long accountNumber=manager.getAccountNumber();
                    // System.out.println("Enter id");
                    // int operationId = sc.nextInt();
                    // sc.nextLine();
                    // System.out.println("enter name");
                    // String name = sc.next();
                    // System.out.println("Enter Amount");
                    // double amount = sc.nextInt();
                    // System.out.println("Enter Account number");
                    // long accountNumber=sc.nextLong();
                    dept.addUser(operationId, name, amount, accountNumber);
                    break;
                }

                case 4: {
                    long accountNumber=manager.getAccountNumber();
                    double amount=manager.getAmount();
                    // System.out.println("Enter Opearation Id");
                    // long Account_number = sc.nextLong();
                    // System.out.println("enter amount to deposite ");
                    // double amount = sc.nextDouble();
                    dept.deposit(accountNumber, amount);
                    break;
                }

                case 5: {
                    long accountNumber=manager.getAccountNumber();
                    double amount=manager.getAmount();
                    // System.out.println("Enter Opearation Id");
                    // long Account_number = sc.nextLong();
                    // System.out.println("enter amount to withdraw dear:");
                    // double amount = sc.nextDouble();
                    dept.withdraw(accountNumber, amount);
                    break;
                }

                case 6:
                long fromAccNumber=manager.getAccountNumber();
                long toAccNumber=manager.getAccountNumber();
                    // System.out.println("enter account number to send");
                    // long fromAccNumber = sc.nextLong();
                    // System.out.println("enter recivers number");
                    // long toAccNumber = sc.nextLong();
                    // System.out.println("enter amount to send ");
                    // double amount = sc.nextDouble();

                    boolean status = dept.fundTransfer(fromAccNumber, toAccNumber, amount);
                    if (status) {
                        System.out.println("fund transfer");
                    } else {
                        System.out.println("fund not transfer");
                    }

            }

        }
    }
}
