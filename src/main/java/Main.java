package src.main.java;

import src.main.java.Utils.PropertyManager;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;


public class Main {
    public static void main(String[] args) {
        PropertyManager p =new PropertyManager();
        Result result = JUnitCore.runClasses(src.main.java.SimpleTest.class);
        System.out.println(result.getFailures().toString());
        System.out.println("Result : "+result.wasSuccessful());
    }
}