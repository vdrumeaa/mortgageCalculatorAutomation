package com.zillow.step_definitions;

import com.zillow.pages.InterestRate;
import com.zillow.utilities.ConfigurationReader;
import com.zillow.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class US3_InterestRate_Label {

    InterestRate interestRate = new InterestRate();

    @Given("I am on the Mortgage Calculator page")
    public void i_am_on_the_mortgage_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("I navigate to interest rate input box")
    public void i_navigate_to_interest_rate_input_box() {
        interestRate.interestRateLabel.getText();
    }

    @Then("I will see the {string} text of the label")
    public void iWillSeeTheTextOfTheLabel(String string) {
        String actualLabelText = interestRate.interestRateLabel.getText();
        assertEquals(string, actualLabelText);
        System.out.println("Actual Label Text = " + actualLabelText);
        System.out.println("Expected Label Text = " + string);
    }
}
