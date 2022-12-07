package com.training.nopcommerce.feature.Register;

import com.training.nopcommerce.pageobject.ManagerHomePageOjbect;
import com.training.nopcommerce.pageobject.PageGenerator;
import com.training.nopcommerce.pageobject.RegisterPageOjbect;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RegisterInvalidTest {
    private WebDriver driver;
    private ManagerHomePageOjbect managerHomePage;
    private RegisterPageOjbect registerPage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        managerHomePage = PageGenerator.getManagerPage(driver);
        registerPage = PageGenerator.getRegisterPage(driver);
    }
    public void TC01_Register_Empty_Data(){
        managerHomePage.clickToRegisterLink();
        registerPage.clickRegisterButton();
    }

    public void After(){
        driver.quit();
    }
}
