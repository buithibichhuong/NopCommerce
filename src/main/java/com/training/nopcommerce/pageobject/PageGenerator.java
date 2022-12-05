package com.training.nopcommerce.pageobject;

import org.openqa.selenium.WebDriver;

public class PageGenerator {
    public static HomePageObject getHomePage(WebDriver driver) {

        return new HomePageObject(driver);
    }


    public static RegisterPageOjbect getRegisterPage(WebDriver driver) {

        return new RegisterPageOjbect(driver);
    }

    public static ManagerHomePageOjbect getManagerPage(WebDriver driver) {

        return new ManagerHomePageOjbect(driver);
    }

}
