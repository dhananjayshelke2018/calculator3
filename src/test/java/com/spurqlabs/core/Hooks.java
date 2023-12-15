package com.spurqlabs.core;

import com.spurqlabs.utils.WebUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestContext{

    @Before
    public void beforeScenario()
    {
        driver= WebUtil.initDriver();
    }

    @After
    public void afterScenario()
    {
        WebUtil.closeDriver();

    }

}
