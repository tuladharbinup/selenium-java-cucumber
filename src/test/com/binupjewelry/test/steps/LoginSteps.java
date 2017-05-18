package com.binupjewelry.test.steps;

import com.binupjewelry.framework.base.DriverContext;
import com.binupjewelry.framework.config.Settings;
import com.binupjewelry.framework.utilities.HelperUtil;
import com.binupjewelry.test.pages.HomePage;
import com.binupjewelry.test.pages.LoginPage;
import com.binupjewelry.test.pojo.Authentication;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

/**
 * Created by Binup on 5/15/2017.
 */
public class LoginSteps {
    HomePage homePage= new HomePage();
    LoginPage loginPage = new LoginPage();
    //Instantiating POJO objects
    Authentication testUser=new Authentication();

    @Given("^Customer open binup-jewelry application$")
    public void iOpenApplication() throws Throwable {
        System.out.println("Navigating to test URL: " + Settings.AUTbaseURL);
        DriverContext.driver.get(Settings.AUTbaseURL);
        DriverContext.driver.manage().window().maximize();
    }
    @When("^he clicks sign in link$")
    public void i_see_and_click_sign_in_link() throws Throwable {
        System.out.println("Clicking sign in ");
        homePage.clickSignIn();
    }

    @And("^enters UserName and Password provided in excel$")
    public void i_enter_UserName_and_Password() throws Throwable {
        System.out.println("Entering username and password");
        loginPage.Login(testUser.getUserName(), testUser.getPassWord());
        HelperUtil.waitForElementToBeVisible(homePage.lnkSignOut);
    }

    @When("^he clicks login button$")
    public void i_click_login_button() throws Throwable {
        System.out.println("Clicked login button");
    }

    @Then("^he should see welcome greeting after successful login$")
    public void i_should_see_welcome_greeting() throws Throwable {
        System.out.println("Verifying if greeting is displayed");
        Assert.assertTrue(homePage.getWelcomeMessage().contains("Welcome"));
    }

}
