package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "day";
    public static final String XPATH_MONTH = "//select[contains(@class, \"_5dba\")][2]";
    public static final String XPATH_YEAR = "//select[contains(@class, \"_5dba\")][3]";


    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectDay = driver.findElement(By.id(XPATH_DAY));
        Select daySelect = new Select(selectDay);
        daySelect.selectByValue("12");

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select monthSelect = new Select(selectMonth);
        monthSelect.selectByIndex(5);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select yearSelect = new Select(selectYear);
        yearSelect.selectByValue("1967");

    }

}
