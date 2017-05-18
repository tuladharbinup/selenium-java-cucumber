package com.binupjewelry.test.steps;

import com.binupjewelry.framework.base.DriverContext;
import com.binupjewelry.framework.config.Settings;
import com.binupjewelry.test.pages.HomePage;
import com.binupjewelry.test.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Binup on 5/15/2017.
 */
public class UnsuccessfulLoginSteps {
    HomePage homePage= new HomePage();
    LoginPage loginPage = new LoginPage();


    @Given("^User opens binup-jewelry application$")
    public void customerOpensBinupJewelryApplication() throws Throwable {
        System.out.println("Navigating to test URL: " + Settings.AUTloginURL);
        DriverContext.driver.get(Settings.AUTloginURL);
        DriverContext.driver.manage().window().maximize();
    }

    @When("^User clicks sign in link$")
    public void i_see_and_click_sign_in_link() throws Throwable {
        System.out.println("Clicking sign in ");
        homePage.clickSignIn();
    }

    @And("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String username, String password) throws Throwable {
        System.out.println("Entering username and password");
        loginPage.Login(username, password);
    }

    @When("^User clicks login button$")
    public void i_click_login_button() throws Throwable {
        System.out.println("Clicked login button");
    }

    @Then("^invalid account message is displayed$")
    public void invalidAccountMessageIsDisplayed() throws Throwable {
        System.out.println("Actual Message: "+loginPage.getInvalidLoginMessage());
        Assert.assertTrue(loginPage.getInvalidLoginMessage().contains("Account details not found"));
    }
}
