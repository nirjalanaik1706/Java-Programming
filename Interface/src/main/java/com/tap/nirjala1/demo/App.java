package com.tap.nirjala1.demo;
//import com.tap.nirjala.demo.ElectricScooter;
//import main.java.com.tap.nirjala1.demo.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        Vehicle v=new Car();
        v.start();
        v.stop();
        v=new ElectricScooter();
        v.start();
        v.stop();
    }
}
