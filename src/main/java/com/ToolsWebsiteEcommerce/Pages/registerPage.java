package com.ToolsWebsiteEcommerce.Pages;

import com.ToolsWebsiteEcommerce.Locators.register_locators;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerPage extends register_locators{
    public registerPage(){
        PageFactory.initElements(driver,this);
    }
    private static registerPage instance;
    userPage userPage;
    public static registerPage getInstance(){
        if(instance==null){
            instance=new registerPage();
        }return instance;
    }



    public void performRegistration() throws InterruptedException {
        userPage =new userPage() ;
        signInButton.click();
        registerYourAccountButton.click();
        firstName.sendKeys(userPage.getFirstName());
        lastName.sendKeys(userPage.getLastName());
        calender.sendKeys(userPage.getCalender());
        address.sendKeys(userPage.getAddress());
        postcode.sendKeys(userPage.getPostcode());
        city.sendKeys(userPage.getCity());
        country.sendKeys(userPage.getCountry());
        state.click();
        Select select=new Select(state);
        select.selectByVisibleText("Albania");
        phone.sendKeys(userPage.getPhone());
        email.sendKeys(userPage.getEmail());
        password.sendKeys(userPage.getPassword());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", registerButton);
        Thread.sleep(50000);
        registerButton.click();

    }


}
