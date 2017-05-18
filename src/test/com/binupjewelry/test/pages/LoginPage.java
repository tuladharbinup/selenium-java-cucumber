package com.binupjewelry.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.binupjewelry.framework.base.BasePage;
import com.binupjewelry.framework.utilities.HelperUtil;


/**
 * Created by binup on 4/18/2017.
 */
public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using ="ctl44_txtLoginEmail")
    public WebElement txtEmail;

    @FindBy(how = How.ID, using ="ctl44_txtLoginPwd")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using ="//a[contains(text(),'Login')]")
    public WebElement btnLogin;

    @FindBy(how = How.ID, using ="ctl44_lblLoginError")
    public WebElement lblInvalidLogin;



    public void Login(String userName, String password) {
    	HelperUtil.sendKeys(txtEmail, userName);
    	HelperUtil.sendKeys(txtPassword, password);
        HelperUtil.clickElement(btnLogin); 
    }

    public String getInvalidLoginMessage() {
        HelperUtil.waitForElementToBeVisible(lblInvalidLogin);
        return lblInvalidLogin.getText();
    }

}
