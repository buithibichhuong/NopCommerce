package com.training.nopcommerce.pageobject;

import com.training.nopcommerce.core.BasePage;
import com.training.nopcommerce.helper.logger.Log;
import com.training.nopcommerce.pageui.RegisterPageUI;
import org.openqa.selenium.WebDriver;

public class RegisterPageOjbect extends BasePage {
    private WebDriver driver;

    public RegisterPageOjbect(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRegisterButton(){
        Log.info("Click to register button");
        waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    public void inputToFirstNameTextbox(String firstName) {
        Log.info("Input to first name " + firstName);
        waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
    }
    public void inputToLastNameTextbox(String lastName) {
        Log.info("Input to last name " + lastName);
        waitForElementVisible(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, lastName);
    }
    public void inputToEmailTextbox(String email) {
        Log.info("Input to email " + email);
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }
    public void inputToPasswordTextbox(String password) {
        Log.info("Input to password " + password);
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
    }
    public void inputToComfirmPasswordTextbox(String comfirmPassword) {
        Log.info("Input to comfirm password " + comfirmPassword);
        waitForElementVisible(driver, RegisterPageUI.COMFIRM_PASSWORD_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.COMFIRM_PASSWORD_TEXTBOX, comfirmPassword);
    }

    public String getMessageErrorFirstName() {
        Log.info("first name message error");
        waitForElementVisible(driver, RegisterPageUI.FIRST_NAME_MESSAGE_ERROR);
        return getTextElement(driver, RegisterPageUI.FIRST_NAME_MESSAGE_ERROR);
    }
    public String getMessageErrorLastName() {
        Log.info("flast name message error");
        waitForElementVisible(driver, RegisterPageUI.LAST_NAME_MESSAGE_ERROR);
        return getTextElement(driver, RegisterPageUI.LAST_NAME_MESSAGE_ERROR);
    }
    public String getMessageErrorEmail() {
        Log.info("Email message error");
        waitForElementVisible(driver, RegisterPageUI.EMAIL_MESSAGE_ERROR);
        return getTextElement(driver, RegisterPageUI.EMAIL_MESSAGE_ERROR);
    }
    public String getMessageErrorPassword() {
        Log.info("Password message error");
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_MESSAGE_ERROR);
        return getTextElement(driver, RegisterPageUI.PASSWORD_MESSAGE_ERROR);
    }
    public String getMessageErrorComfirmPassword() {
        Log.info("Comfirm password message error");
        waitForElementVisible(driver, RegisterPageUI.COMFIRM_PASSWORD_MESSAGE_ERROR);
        return getTextElement(driver, RegisterPageUI.COMFIRM_PASSWORD_MESSAGE_ERROR);
    }
    public String getMessageRegisterSuccess(){
        Log.info("Comfirm register success");
        waitForElementVisible(driver, RegisterPageUI.MESSAGE_REGISTER_SUCCESS);
        return getTextElement(driver, RegisterPageUI.MESSAGE_REGISTER_SUCCESS);
    }
    public String getMessageEmailExist(){
        Log.info("get message email exist");
        waitForElementVisible(driver, RegisterPageUI.MESSAGE_EMAIL_EXIST);
        return getTextElement(driver, RegisterPageUI.MESSAGE_EMAIL_EXIST);
    }
}
