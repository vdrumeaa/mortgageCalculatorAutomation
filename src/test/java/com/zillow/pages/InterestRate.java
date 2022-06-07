package com.zillow.pages;

import com.zillow.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InterestRate {
    public InterestRate(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='rate']")
    public WebElement interestRateInputBox;

    @FindBy(xpath = "//label[@id='label_10']")
    public WebElement interestRateLabel;

    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement seeCurrentRatesLink;

    @FindBy(xpath = "//p[contains(text(),'Rate must be greater than or equal to 0')]")
    public WebElement negativeValueErrorMessage;
    ///html//div[@id='zmm-calc-payment']//div[@class='Flex-c11n-8-64-1__sc-n94bjd-0 kfWtKv']/div[1]/form[@class='Form-c11n-8-64-1__sc-iqxs9k-0 gjlJsf']//p[@class='StyledFormHelp-c11n-8-64-1__sc-h3s6hy-0 lfSzwh']

    @FindBy(xpath = "//p[contains(text(),'Rate must be less than or equal to 100')]")
    //@FindBy(xpath = "//p[.='Rate must be less than or equal to 100']")
    public WebElement valueHigherThan101ErrorMessage;

    @FindBy(xpath = "(//span[@class='VisuallyHidden-c11n-8-64-1__sc-t8tewe-0 higCPc'])[9]")
    public WebElement ariaExpandedButton;

    @FindBy(xpath = "(//label[@aria-hidden='true'])[4]")
    public WebElement percentageLabel;

    @FindBy(xpath = "//div[@class='Flex-c11n-8-64-1__sc-n94bjd-0 zgmi__i17mpm-1 fsawwb ikOMXw']")
    public WebElement emptyLabel;

    @FindBy(xpath = "//p[@class='StyledFormHelp-c11n-8-64-1__sc-h3s6hy-0 lfSzwh']")
    public WebElement specialCharErrorMessage;

}
