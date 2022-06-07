package com.zillow.step_definitions;

import com.zillow.pages.InterestRate;
import com.zillow.utilities.BrowserUtils;
import com.zillow.utilities.ConfigurationReader;
import com.zillow.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US8_SeeCurrentRates_Link {

    InterestRate interestRate = new InterestRate();

    @Given("I am on the mortgage calculator page")
    public void i_am_on_the_mortgage_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I click the link text See current rates")
    public void i_click_the_link_text_see_current_rates() {
        interestRate.seeCurrentRatesLink.click();
    }

    @Then("I should see the page title {string}")
    public void iShouldSeeThePageTitle(String string) {
        BrowserUtils.verifyTitle(string, Driver.getDriver());
    }

}

