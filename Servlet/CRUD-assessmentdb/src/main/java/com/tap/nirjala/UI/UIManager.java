package com.tap.nirjala.UI;

import java.sql.*;
import java.util.*;

import com.tap.nirjala.demo.*;
import com.tap.nirjala.entity.*;
import com.tap.nirjala.UI.*;
import com.tap.nirjala.DBManager.*;

import javafx.scene.chart.PieChart.Data;


public class UIManager {

        public Scanner sc=new Scanner(System.in);
        public void displayMenu()
        {
            System.out.println();
            System.out.println("-----Menu for database-----");
            System.out.println();
            System.out.println("1. CREATE");
            System.out.println("2. INSERT");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. SELECT");
            System.out.println("6.EXIT");
        }
    public void getData()
    {
        Data data1=new data();
        switch(App.choice)
        {
            case 2:
            {
                System.out.println("Enter name");
                data1.setName(sc.nextLine());
                System.out.println();
            break;
            }
            case 3:
            {
                System.out.println("Enter id");
                data1.setId(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter name");
                data1.setName(sc.nextLine());
                System.out.println();
            }
            case 4:
            {
                System.out.println("enter id");
                data1.setId(sc.nextInt());
                sc.nextLine();
            break;
            }
        }
        return data1;
    }

    public int getChoice()
    {
        System.out.println();
        System.out.println("Enter your choice");
        return sc.nextInt();
    }
    public static void displaySelectRe
}
