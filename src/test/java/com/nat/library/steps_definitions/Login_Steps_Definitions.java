package com.nat.library.steps_definitions;

import com.nat.library.pages.LoginPage;
import com.nat.library.utilities.ConfigurationReader;
import com.nat.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Steps_Definitions {

    LoginPage login_page = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env1"));

    }
    @When("user uses username {string} and passcode {string} and user clicks the login button")
    public void user_use_username_and_passcode_and_user_clicks_the_login_button(String string, String string2) {
        login_page.userEmailInput.sendKeys(string);
        login_page.passwordInput.sendKeys(string2);
        login_page.signInBtn.click();

    }
    @Then("verify the user should see page title is {string}")
    public void verifyTheUserShouldSeePageTitleIs(String expectedTitle) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

}
