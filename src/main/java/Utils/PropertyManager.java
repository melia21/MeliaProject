package main.java.Utils;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {
    public  String CHROME_DRIVER_EXE_PATH;
    public  String URL;
    public PropertyManager(){
        initProperties();
    }
    private void initProperties () {
        String propertyPath ="/TestProject1/src/main/resources/Properties/selenium.properties";
        Properties props = new Properties();
        FileInputStream in;
        try {

            in = new FileInputStream(propertyPath);
            props.load(in);
            CHROME_DRIVER_EXE_PATH=props.getProperty("Driver.Chrome.Path");
            URL=props.getProperty("Project.Url");
        }
        catch (java.io.IOException e){
            System.out.println("File not found " + propertyPath);
        }
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, CHROME_DRIVER_EXE_PATH);

    }

}
