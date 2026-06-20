package com.transflower.Managers;

import java.util.*;

public class UIManager {

    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("===============================");
        System.out.println("1. display user");
        System.out.println("2. Check Balance");
        System.out.println("3. add user");
        System.out.println("4. Deposite");
        System.out.println("5. withdraw");
        System.out.println("6.Fund Transfer");
        System.out.println("7. exit");
        System.out.println("===============================");

    }

    public int getChoice() {
        System.out.println("enter choice......!!!!!!!!!");

        System.out.println("===============================");
        int choice = sc.nextInt();
        return choice;

    }

    public long getAccountNumber() {
        System.out.println("enter account Number ");
        long accountNumber = sc.nextLong();
        return accountNumber;
    }

    public int getId() {
        System.out.println("Enter id");
        int operationId = sc.nextInt();
        return operationId;
    }

    public String getName() {
        System.out.println("enter name");
        String name = sc.next();
        return name;

    }

    public double getAmount() {
        System.out.println("Enter Amount");
        double amount = sc.nextInt();
        return amount;
    }
}
