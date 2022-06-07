package com.zillow.step_definitions;

import com.zillow.pages.InterestRate;
import com.zillow.utilities.ConfigurationReader;
import com.zillow.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class US2_specialChar_interestRate {

    InterestRate interestRate = new InterestRate();


    @When("I clear the Interest Rate input box")
    public void iClearTheInterestRateInputBox() {
        interestRate.interestRateInputBox.clear();
    }

    @And("I type special character {string} into Interest rate input box")
    public void i_type_special_character_into_interest_rate_input_box(String string) {
        interestRate.interestRateInputBox.sendKeys(string);
    }

    @And("I click outside the input box Interest rate")
    public void i_click_outside_the_input_box_interest_rate() {
        interestRate.emptyLabel.click();
    }

    @Then("I will see the error message {string} is displayed")
    public void i_will_see_the_error_message_is_displayed(String string) {
        String actualErrorMessage = interestRate.specialCharErrorMessage.getText();
        System.out.println("Actual Error Message = " + actualErrorMessage);
        System.out.println("Expected Error Message = " + string);
        assertEquals(string, actualErrorMessage);

    }

    }

