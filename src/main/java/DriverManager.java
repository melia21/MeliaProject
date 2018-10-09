package main.java;

import org.openqa.selenium.chrome.ChromeDriver;


public class DriverManager {
    public DriverManager(){
        System.out.println("Object DriverManager created");
    }
    ChromeDriver driver = new ChromeDriver();
    public void start(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }
}