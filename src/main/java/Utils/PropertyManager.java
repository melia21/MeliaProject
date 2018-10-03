package main.java.Utils;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {
    public static String CHROME_DRIVER_EXE_PATH;
    public static String URL;
    public static void initProperties () {
        Properties props = new Properties();
        FileInputStream in;
        try {
            System.out.println("Started to initialize properties");
            in = new FileInputStream("main/resources/Properties/selenium.properties");
            props.load(in);
            CHROME_DRIVER_EXE_PATH=props.getProperty("Driver.Chrome.Path");
            URL=props.getProperty("project.Url");
        }
        catch (java.io.IOException e){
            System.out.println("File not found");
        }
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, CHROME_DRIVER_EXE_PATH);


    }
}
