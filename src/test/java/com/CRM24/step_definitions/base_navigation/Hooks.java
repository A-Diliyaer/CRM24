package com.CRM24.step_definitions.base_navigation;

import com.CRM24.util.ConfigurationReader;
import com.CRM24.util.Driver;
import com.CRM24.util.UiUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println("Starting test automation ::::");
        System.out.println("Browser type :: "+ ConfigurationReader.getProperty("browser"));
        System.out.println("Environment :: "+ ConfigurationReader.getProperty("URL"));
        System.out.println("Test scenario :: "+scenario.getName());
        Driver.getDriver().manage().window().maximize();
        UiUtil.initUi();
    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.embed(image, "image/png", scenario.getName());
        }
        System.out.println("test clean up");
        Driver.closeDriver();
    }
}
