package com.ToolsWebsiteEcommerce.Locators;

import com.ToolsWebsiteEcommerce.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register_locators extends Base {
    public register_locators(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@data-test='nav-sign-in']")
    protected WebElement signInButton;
    @FindBy(xpath = "//*[@data-test='register-link']")
    protected WebElement registerYourAccountButton;
    @FindBy(xpath = "//*[@data-test='first-name']")
    protected WebElement firstName;
    @FindBy(xpath = "//*[@data-test='last-name']")
    protected WebElement lastName;
    @FindBy(xpath = "//*[@data-test='dob']")
    protected WebElement calender;
    @FindBy(xpath = "//*[@data-test='address']")
    protected WebElement address;
    @FindBy(xpath = "//*[@data-test='postcode']")
    protected WebElement postcode;
    @FindBy(xpath = "//*[@data-test='city']")
    protected WebElement city;
    @FindBy(xpath = "//*[@data-test='state']")
    protected WebElement country;
    @FindBy(xpath = "//*[@data-test='country']")
    protected WebElement state;
    @FindBy(xpath = "//*[@data-test='phone']")
    protected WebElement phone;
    @FindBy(xpath = "//*[@data-test='email']")
    protected WebElement email;
    @FindBy(xpath = "//*[@data-test='password']")
    protected WebElement password;
    @FindBy(xpath = "//*[@data-test='register-submit']")
    protected WebElement registerButton;

}
