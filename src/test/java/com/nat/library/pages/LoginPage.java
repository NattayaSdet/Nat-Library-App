package com.nat.library.pages;

import com.nat.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement userEmailInput;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInBtn;



    public void login(String username, String password) {
        userEmailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInBtn.click();

    }
}


