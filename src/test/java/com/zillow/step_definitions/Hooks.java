package com.zillow.step_definitions;

import com.zillow.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();
    }
}

