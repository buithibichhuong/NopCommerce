package com.training.nopcommerce.pageobject;

import com.training.nopcommerce.core.BasePage;
import com.training.nopcommerce.helper.logger.Log;
import com.training.nopcommerce.pageui.ManagerHomePageUI;
import org.openqa.selenium.WebDriver;

public class ManagerHomePageOjbect extends BasePage {
    private WebDriver driver;
    public ManagerHomePageOjbect (WebDriver driver){
        this.driver = driver;
    }

    public void clickToRegisterLink() {
        Log.info("Click to register link");
        waitForElementClickable(driver, ManagerHomePageUI.REGISTER_LINK);
        clickToElement(driver, ManagerHomePageUI.REGISTER_LINK);
    }

}
