package com.tap.nirjala.demo;

import javax.swing.UIManager;

import com.tap.nirjala.demo.*;
import com.tap.nirjala.entity.*;
import com.tap.nirjala.UI.*;
import com.tap.nirjala.DBManager.*;

public class App{
    public static int choice;
    public static void main(String[] args) {
        UIManager manager=new UIManager();
        do { 
            manager.displayMenu();
            choice=manager.getChoice();
            switch(choice)
            {
                case 1:
                {
                    if(DBManager.create())
                    {
                        UIManager.displayMessage(0);
                    }
                break;
                }
                case 2:
                {
                    int rowAffectes=DBManager.insert();
                    if(rowsAffected > -1)
                    {
                        UIManager.displayMessage(rowsAffected);
                    }
                break;
                }
                case 3:
                {
                    int rowsAffected=DBManager.update();
                    if(rowsAffected > -1)
                    {
                        UIManager.displayMessage(rowsAffected);
                    }
                break;
                }
                case 4:
                {
                    int rowsAffected=DBManager.delete();
                    if(rowsAffected > -1)
                    {
                        UIManager.displayMessage(rowsAffected);
                    }
                }
                case 5:
                {
                    int rowsAffected=DBManager.getAll();
                    if(rowsAffected > -1)
                    {
                        UIManager.displayMessage(rowsAffected);
                    }
                break;
                }
                default:
                {
                    UIManager.displayMessage(0);
                break;
                }
            }
        } while (true);
    }
}
