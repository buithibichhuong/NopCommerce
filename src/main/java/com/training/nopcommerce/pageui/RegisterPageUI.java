package com.training.nopcommerce.pageui;

import static com.training.nopcommerce.core.Locator.xpath;

public class RegisterPageUI {
    public static final String REGISTER_BUTTON = xpath("//button[@name='register-button']");

    public static final String GENDER_RADIOBUTTON= xpath("//input[@value='m']");
    public static final String DATEOFBIRTH_TEXTBOX = xpath("//input[@name='dob']");
    public static final String ADDRESS_TEXTBOX = xpath("//textarea[@name='addr']");
    public static final String CITY_TEXTBOX = xpath("//input[@name='city']");
    public static final String STATE_TEXTBOX = xpath("//input[@name='state']");
    public static final String PIN_TEXTBOX = xpath("//input[@name='pinno']");
    public static final String PHONE_TEXTBOX = xpath("//input[@name='telephoneno']");
    public static final String EMAIL_TEXTBOX = xpath("//input[@name='emailid']");
    public static final String PASSWORD_TEXTBOX = xpath("//input[@name='password']");
    public static final String SUBMIT_BUTTON = xpath("//input[@name='sub']");
    public static final String HEADING3_LABEL = xpath("//p[@class='heading3']");
    public static final String NAME_LABEL = xpath("//td[text()='Customer Name']/following-sibling::td");
    public static final String GENDER_LABEL = xpath("//td[text()='Gender']/following-sibling::td");
    public static final String BIRTHDAY_LABEL = xpath("//td[text()='Birthdate']/following-sibling::td");
    public static final String ADDRESS_LABEL = xpath("//td[text()='Address']/following-sibling::td");
    public static final String CITY_LABEL = xpath("//td[text()='City']/following-sibling::td");
    public static final String STATE_LABEL = xpath("//td[text()='State']/following-sibling::td");
    public static final String PIN_LABEL = xpath("//td[text()='Pin']/following-sibling::td");
    public static final String PHONE_LABEL = xpath("//td[text()='Mobile No.']/following-sibling::td");
    public static final String EMAIL_LABEL = xpath("//td[text()='Email']/following-sibling::td");

    public static final  String CUSTOMER_ID_LABLE = xpath("//td[contains(text(),'Customer ID')]/following-sibling::td");
}
