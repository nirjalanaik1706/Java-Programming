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

    public int getChoice(String message) {
        System.out.println(message);
        System.out.println("===============================");
        int choice = sc.nextInt();
        return choice;

    }

    public long getAccountNumber(String message) {
        System.out.println(message);
        System.out.println("===============================");
        long accountNumber = sc.nextLong();
        return accountNumber;
    }

    public int getId(String message) {
        System.out.println(message);
        System.out.println("===============================");
        int operationId = sc.nextInt();
        return operationId;
    }

    public String getName(String message) {
        System.out.println(message);
        System.out.println("===============================");
        String name = sc.next();
        return name;

    }

    public double getAmount(String message) {
        System.out.println(message);
        System.out.println("===============================");
        double amount = sc.nextInt();
        return amount;
    }
}
