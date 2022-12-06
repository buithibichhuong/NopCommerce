package com.training.nopcommerce.pageui;

import static com.training.nopcommerce.core.Locator.xpath;

public class RegisterPageUI {
    public static final String REGISTER_BUTTON = xpath("//button[@name='register-button']");

    public static final String FIRST_NAME_MESSAGE_ERROR = xpath("//span[@id='FirstName-error']");
    public static final String LAST_NAME_MESSAGE_ERROR = xpath("//span[@id='LastName-error']");
    public static final String EMAIL_MESSAGE_ERROR = xpath("//span[@id='Email-error']");
    public static final String PASSWORD_MESSAGE_ERROR = xpath("//span[@id='Password-error']");
    public static final String COMFIRM_PASSWORD_MESSAGE_ERROR = xpath("//span[@id='ConfirmPassword-error']");
    public static final String FIRST_NAME_TEXTBOX = xpath("//input[@id='FirstName']");
    public static final String LAST_NAME_TEXTBOX = xpath("//input[@id='LastName']");
    public static final String EMAIL_TEXTBOX = xpath("//input[@id='Email']");
    public static final String PASSWORD_TEXTBOX = xpath("//input[@id='Password']");
    public static final String COMFIRM_PASSWORD_TEXTBOX = xpath("//input[@id='ConfirmPassword']");
    public static final String MESSAGE_EMAIL_EXIST = xpath("//li[text()='The specified email already exists']");
    public static final String REGISTER_SUCCESS =xpath("//div[@class='result']");
}
