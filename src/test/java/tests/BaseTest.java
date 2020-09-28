package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

public class BaseTest {
//    public final static String USERNAME = "hoolsf@mail.ru";
//    public final static String PASSWORD = "123456789fedor";

    LoginPage loginPage;


    @BeforeMethod
    public void setup() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.clickViaJs = true;
        Configuration.startMaximized = true;
        loginPage = new LoginPage();
    }
}