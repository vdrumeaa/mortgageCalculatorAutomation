package com.zillow.step_definitions;

import com.zillow.pages.InterestRate;
import com.zillow.utilities.BrowserUtils;
import com.zillow.utilities.ConfigurationReader;
import com.zillow.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class US1_InvalidValues_InterestRate {
    InterestRate interestRate = new InterestRate();

    @Given("I am  on the mortgage calculator page")
    public void i_am_on_the_mortgage_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I clear the input box")
    public void i_clear_the_input_box() {
        interestRate.interestRateInputBox.clear();
    }

    @When("I enter {string} values")
    public void i_enter_values(String string) {
        interestRate.interestRateInputBox.sendKeys(string);
    }

    @And("click empty space")
    public void clickEmptySpace() {
        interestRate.emptyLabel.click();
    }

    @Then("I should see error messages {string}")
    public void i_should_see_error_messages(String string) {
        BrowserUtils.sleep(3);
        String actualErrorMessageNegatives = interestRate.negativeValueErrorMessage.getText();
        System.out.println("Actual Error Message = " + actualErrorMessageNegatives);
        System.out.println("Expected Error Message = " + string);
        assertEquals(string, actualErrorMessageNegatives);

    }

    @Then("I should see error messages for values greater than one hundred {string}")
    public void iShouldSeeErrorMessagesForValuesGreaterThanOneHundred(String string) {
        BrowserUtils.sleep(3);
        String actualErrorMessageValueHigherThan100 = interestRate.valueHigherThan101ErrorMessage.getText();
        System.out.println("Actual Error Message = " + actualErrorMessageValueHigherThan100);
        System.out.println("Expected Error Message = " + string);
        assertEquals(string, actualErrorMessageValueHigherThan100);
    }
}

