package main.java;

import main.java.Utils.PropertyManager;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


public class Main {
    public static void main(String[] args) {
        PropertyManager p =new PropertyManager();
        DriverManager driver = new DriverManager();
        driver.get(p.URL);
        if (driver.isEnabled(AhlPage.LOGOSBAR) ==true) {
            System.out.println("I have found LOGOBAR");
        }
        else{
            System.out.println("Get a hell out of here");
        }
        //Result result = JUnitCore.runClasses();
        //System.out.println(result.getFailures().toString());
        //System.out.println("Result : "+result.wasSuccessful());
        driver.quit();
    }
}