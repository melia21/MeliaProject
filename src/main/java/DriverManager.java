package main.java;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverManager extends ChromeDriver {
    public DriverManager(){
        System.out.println("Object DriverManager created");
    }
    public boolean isEnabled(String locator){
        try {
            return findElement(By.xpath(locator)).isEnabled();
        }
        catch(org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
}
