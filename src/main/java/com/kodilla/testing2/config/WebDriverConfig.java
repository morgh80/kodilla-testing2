package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {

    public final static String CHROME = "CHROME_DRIVER";

    public static WebDriver getDriver(final String driver) {
        System.setProperty("webdriver.chrome.driver", "/Users/aeronaut/Documents/Java/Kodilla/kodilla-DevTools/Selenium-drivers/chromedriver");
        if (driver.equals(CHROME)) {
            return new ChromeDriver();
        } else {
            return null;
        }
    }

}
