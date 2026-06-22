package com.transflower.Managers;

import java.util.*;

public class UIManager {

    Scanner sc = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("==============================");
        System.out.println("1. Display user");
        System.out.println("2. Check Balance");
        System.out.println("3. Add new user");
        System.out.println("4. Deposite");
        System.out.println("5. Withdraw");
        System.out.println("6. Fund Transfer");
        System.out.println("7. Mini statements");
        System.out.println("8. Exit");
    }

    public int getChoice(String message) {
        System.out.println(message);
        int choice = sc.nextInt();
        System.out.println("==============================");
        System.out.println("");
        return choice;
    }

    public String getAccountNumber(String message) {
        System.out.println(message);
        System.out.println("===============================");
        String accountNumber = sc.next();
        return accountNumber;
    }

    public String getName(String message) {
        System.out.println(message);
        System.out.println("===============================");
        String name = sc.next();
        return name;

    }

    public double getBalance(String message) {
        System.out.println(message);
        System.out.println("===============================");
        double balance = sc.nextDouble();
        return balance;
    }
}
