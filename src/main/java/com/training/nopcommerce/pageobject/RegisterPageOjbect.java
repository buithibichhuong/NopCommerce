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

    public void inputToDateOfBirthTextbox(String dateOfBirth) {
        waitForElementVisible(driver, RegisterPageUI.DATEOFBIRTH_TEXTBOX);
        removeAttributeInDOM(driver, RegisterPageUI.DATEOFBIRTH_TEXTBOX,"type");
        sendKeyToElement(driver, RegisterPageUI.DATEOFBIRTH_TEXTBOX, dateOfBirth);
    }

    public void inputToAddressTextbox(String address) {
        waitForElementVisible(driver, RegisterPageUI.ADDRESS_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.ADDRESS_TEXTBOX, address);
    }

    public void inputToCityTextbox(String city) {
        waitForElementVisible(driver, RegisterPageUI.CITY_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.CITY_TEXTBOX, city);
    }

    public void inputToStateTextbox(String state) {
        waitForElementVisible(driver, RegisterPageUI.STATE_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.STATE_TEXTBOX, state);
    }

    public void inputToPinTextbox(String pin) {
        waitForElementVisible(driver, RegisterPageUI.PIN_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.PIN_TEXTBOX, pin);
    }

    public void inputToPhoneTextbox(String phone) {
        waitForElementVisible(driver, RegisterPageUI.PHONE_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.PHONE_TEXTBOX, phone);
    }

    public void inputToEmailTextbox(String email) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    public void clickToSubmitButton() {
        waitForElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
        clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
    }

    public String getTextHeading3() {
        waitForElementVisible(driver, RegisterPageUI.HEADING3_LABEL);
        return getTextElement(driver, RegisterPageUI.HEADING3_LABEL);
    }

    public String getTextNameLabel() {
        waitForElementVisible(driver, RegisterPageUI.NAME_LABEL);
        return getTextElement(driver, RegisterPageUI.NAME_LABEL);
    }

    public String getTextGenderLabel() {
        waitForElementVisible(driver, RegisterPageUI.GENDER_LABEL);
        return getTextElement(driver, RegisterPageUI.GENDER_LABEL);
    }

    public String getTextBirthDayLabel() {
        waitForElementVisible(driver, RegisterPageUI.BIRTHDAY_LABEL);
        return getTextElement(driver, RegisterPageUI.BIRTHDAY_LABEL);
    }

    public String getTextAddressLabel() {
        waitForElementVisible(driver, RegisterPageUI.ADDRESS_LABEL);
        return getTextElement(driver, RegisterPageUI.ADDRESS_LABEL);
    }

    public String getTextCityLabel() {
        waitForElementVisible(driver, RegisterPageUI.CITY_LABEL);
        return getTextElement(driver, RegisterPageUI.CITY_LABEL);
    }

    public String getTextStateLabel() {
        waitForElementVisible(driver, RegisterPageUI.STATE_LABEL);
        return getTextElement(driver, RegisterPageUI.STATE_LABEL);
    }

    public String getTextPinLabel() {
        waitForElementVisible(driver, RegisterPageUI.PIN_LABEL);
        return getTextElement(driver, RegisterPageUI.PIN_LABEL);
    }

    public String getTextPhoneLabel() {
        waitForElementVisible(driver, RegisterPageUI.PHONE_LABEL);
        return getTextElement(driver, RegisterPageUI.PHONE_LABEL);
    }

    public String getTextEmailLabel() {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_LABEL);
        return getTextElement(driver, RegisterPageUI.EMAIL_LABEL);
    }
    public String getTextCustomerID() {
        waitForElementVisible(driver, RegisterPageUI.CUSTOMER_ID_LABLE);
        return getTextElement(driver, RegisterPageUI.CUSTOMER_ID_LABLE);
    }
}
