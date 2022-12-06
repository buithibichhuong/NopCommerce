package com.training.nopcommerce.feature.Register;

import com.training.nopcommerce.pageobject.ManagerHomePageOjbect;
import com.training.nopcommerce.pageobject.PageGenerator;
import com.training.nopcommerce.pageobject.RegisterPageOjbect;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.util.Random;

public class RegisterTest {
    private WebDriver driver;
    private ManagerHomePageOjbect managerHomePage;
    private RegisterPageOjbect registerPage;
    private String firstName, lastName, wrongEmail,emailExist, email, password, comfirmPassword, passwordInvalid, comfirmPasswordInvalid;

    @BeforeTest
    public void setUp() {
        firstName ="Huong";
        lastName = "Bui";
        wrongEmail ="123";
        emailExist ="automationfc.vn@gmail.com";
        email = "buihuong" + randomNumber() + "@gmail.com";
        password ="12345678";
        comfirmPassword ="12345678";
        passwordInvalid="123";
        comfirmPasswordInvalid="123456";
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

        Assert.assertEquals(registerPage.getMessageErrorFirstName(), "First name is required.");
        Assert.assertEquals(registerPage.getMessageErrorLastName(), "Last name is required.");
        Assert.assertEquals(registerPage.getMessageErrorEmail(), "Email is required.");
        Assert.assertEquals(registerPage.getMessageErrorPassword(), "Password is required.");
        Assert.assertEquals(registerPage.getMessageErrorComfirmPassword(), "Password is required.");
    }
    public void TC02_Register_Wrong_Email(){
        managerHomePage.clickToRegisterLink();
        registerPage.inputToFirstNameTextbox(firstName);
        registerPage.inputToLastNameTextbox(lastName);
        registerPage.inputToEmailTextbox(wrongEmail);
        registerPage.inputToPasswordTextbox(password);
        registerPage.inputToComfirmPasswordTextbox(comfirmPassword);
        registerPage.clickRegisterButton();

        Assert.assertEquals(registerPage.getMessageErrorEmail(),"Wrong email");
    }
    public void TC03_Register_Success(){
        managerHomePage.clickToRegisterLink();
        registerPage.inputToFirstNameTextbox(firstName);
        registerPage.inputToLastNameTextbox(lastName);
        registerPage.inputToEmailTextbox(email);
        registerPage.inputToPasswordTextbox(password);
        registerPage.inputToComfirmPasswordTextbox(comfirmPassword);
        registerPage.clickRegisterButton();

        Assert.assertEquals(registerPage.getMessageRegisterSuccess(),"Your registration completed");
    }
    public void TC04_Register_Email_Exist(){
        managerHomePage.clickToRegisterLink();
        registerPage.inputToFirstNameTextbox(firstName);
        registerPage.inputToLastNameTextbox(lastName);
        registerPage.inputToEmailTextbox(emailExist);
        registerPage.clickRegisterButton();

        Assert.assertEquals(registerPage.getMessageErrorEmail(),"The specified email already exists");
    }
    public void TC05_Register_Password_Invalid(){
        managerHomePage.clickToRegisterLink();
        registerPage.inputToFirstNameTextbox(firstName);
        registerPage.inputToLastNameTextbox(lastName);
        registerPage.inputToEmailTextbox(email);
        registerPage.inputToPasswordTextbox(passwordInvalid);
        registerPage.clickRegisterButton();

        Assert.assertEquals(registerPage.getMessageErrorPassword(),"Password must meet the following rules:\n" +
                "\n" +
                "must have at least 6 characters");
    }
    public void TC06_Register_Comfirm_Password_Invalid(){
        managerHomePage.clickToRegisterLink();
        registerPage.inputToFirstNameTextbox(firstName);
        registerPage.inputToLastNameTextbox(lastName);
        registerPage.inputToEmailTextbox(email);
        registerPage.inputToPasswordTextbox(password);
        registerPage.inputToComfirmPasswordTextbox(comfirmPasswordInvalid);
        registerPage.clickRegisterButton();

        Assert.assertEquals(registerPage.getMessageErrorComfirmPassword(),"The password and confirmation password do not match.");
    }
    private int randomNumber() {
        Random ran = new Random();
        return ran.nextInt(999);
    }
    public void After(){
        driver.quit();
    }
}
