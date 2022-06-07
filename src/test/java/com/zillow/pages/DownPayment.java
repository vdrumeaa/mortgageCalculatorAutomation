package com.zillow.pages;

import com.zillow.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownPayment {

    public DownPayment() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement downPaymentInputBox;
}
