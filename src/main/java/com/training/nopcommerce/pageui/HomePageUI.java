package com.training.nopcommerce.pageui;

import static com.training.nopcommerce.core.Locator.xpath;

public class HomePageUI {
    public static final String EMAIL_TEXTBOX = xpath("//input[@name='emailid']");
    public static final String SUBMIT_BUTTON = xpath("//input[@name='btnLogin']");
    public static final String USERID_LABEL = xpath("//table[@align='center']//td[contains(text(),'User')]/following-sibling::td");
    public static final String PASSWORD_LABEL = xpath("//table[@align='center']//td[contains(text(),'Password')]/following-sibling::td");

}
