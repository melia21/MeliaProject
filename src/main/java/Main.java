package src.main.java;
import main.java.Utils.PropertyManager;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {
    public static void main(String[] args) {
        PropertyManager.initProperties();
        Result result = JUnitCore.runClasses(SimpleTest);
        System.out.println(result.getFailures().toString());
        System.out.println("Result : "+result.wasSuccessful());
    }
}