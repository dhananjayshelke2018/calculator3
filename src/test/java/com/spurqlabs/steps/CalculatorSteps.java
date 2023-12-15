package com.spurqlabs.steps;

import com.spurqlabs.pages.BasicCalculatorPage;
import com.spurqlabs.core.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CalculatorSteps extends TestContext {
    BasicCalculatorPage basicCalculatorPage;

    @Given("I am on basic calculator page")
    public void iAmOnCalculatorPage() {
        driver.get("https://www.calculator.net/");
    }

    @When("I enter {string} {string} {string}")
    public void iEnter(String number1, String operator, String number2) {
        basicCalculatorPage = new BasicCalculatorPage(driver);
        basicCalculatorPage.calculate(number1,operator,number2);
    }

    @Then("I see the result as {string}")
    public void iSeeTheResultAs(String expectedResult) {
        Assert.assertEquals(basicCalculatorPage.getResults(),expectedResult);
    }


}
