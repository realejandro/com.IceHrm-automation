package utils;

import org.openqa.selenium.WebDriver;

public class DriverHelper {
    private static WebDriver driver;

    private DriverHelper(){}

    public static WebDriver getDriver(){
        return driver;
    }

}
