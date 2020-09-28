package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    public void openPage() {
        open("https://moodpanda.com/Login/");

    }


    public void logIn() {

        $(By.name("ctl00$ContentPlaceHolderContent$TextBoxEmail")).sendKeys("hoolsf@mail.ru");
        $(By.name("ctl00$ContentPlaceHolderContent$TextBoxPassword")).setValue("123456789fedor").pressEnter();
    }
}
