package com.spurqlabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicCalculatorPage {

    WebDriver driver;
    public BasicCalculatorPage(WebDriver driver1)
    {
        this.driver = driver1;
    }
    public void calculate(String number1, String operator, String number2)
    {
        driver.findElement(By.xpath("//span[text()='"+number1+"']")).click();
        driver.findElement(By.xpath("//span[text()='"+operator+"']")).click();
        driver.findElement(By.xpath("//span[text()='"+number2+"']")).click();
    }

    public String getResults() {
        return driver.findElement(By.id("sciOutPut")).getText().trim();
    }
}
