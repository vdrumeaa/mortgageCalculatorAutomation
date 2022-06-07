package com.zillow.pages;

import com.zillow.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePrice {

    public HomePrice() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement homePriceInputBox;
}
