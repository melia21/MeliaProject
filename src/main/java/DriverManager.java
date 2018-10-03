package src.main.java;

import org.openqa.selenium.chrome.ChromeDriver;
public class DriverManager {
    ChromeDriver driver = new ChromeDriver();
    public void start(String url) {
        driver.get(url);
    }

    public void quit() {
        driver.quit();
    }
}