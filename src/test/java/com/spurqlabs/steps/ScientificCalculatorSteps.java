package com.spurqlabs.steps;

import com.spurqlabs.core.TestContext;
import io.cucumber.java.en.Given;

public class ScientificCalculatorSteps extends TestContext {

    @Given("I am on scientific calculator page")
    public void iAmOnScientificCalculatorPage() {
        driver.get("https://www.calculator.net/scientific-calculator.html");
    }
}
