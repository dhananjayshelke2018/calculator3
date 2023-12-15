package com.spurqlabs.utils;

import com.spurqlabs.core.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUtil extends TestContext {
    public static WebDriver initDriver()
    {
        driver = new ChromeDriver();
        return driver;
    }

    public static void closeDriver()
    {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
    }
}
