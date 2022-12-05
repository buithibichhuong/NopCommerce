package com.training.nopcommerce.pageobject;

import com.training.nopcommerce.core.BasePage;
import com.training.nopcommerce.pageui.HomePageUI;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
    private WebDriver driver;
    public HomePageObject(WebDriver driver) {
        this.driver = driver;

    }

    public  void inputEmail (String email) {
        waitForElementVisible(driver, HomePageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver, HomePageUI.EMAIL_TEXTBOX, email);
    }
    public void clickLoginButton (){
        waitForElementVisible(driver,HomePageUI.SUBMIT_BUTTON);
        clickToElement(driver,HomePageUI.SUBMIT_BUTTON);
    }
    public String getTextUserID(){
        waitForElementVisible(driver,HomePageUI.USERID_LABEL);
        return getTextElement(driver,HomePageUI.USERID_LABEL);
    }
    public String getTextPassword(){
        waitForElementVisible(driver,HomePageUI.PASSWORD_LABEL);
        return getTextElement(driver,HomePageUI.PASSWORD_LABEL);
    }
}
