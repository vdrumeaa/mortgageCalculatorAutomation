package com.zillow.pages;

import com.zillow.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanProgram {

    public LoanProgram() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@id='form-3_term']")
    public WebElement loanProgramDropDown;
}
