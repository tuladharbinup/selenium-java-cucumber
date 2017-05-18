package com.binupjewelry.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.binupjewelry.framework.base.BasePage;
import com.binupjewelry.framework.base.DriverContext;
import com.binupjewelry.framework.utilities.HelperUtil;

public class ProductDetailPage extends BasePage {
	
	@FindBy(how=How.CSS, using = "#product h1")
    public WebElement productTitle;
		
	@FindBy(how=How.XPATH, using = "//input[@value='Buy']")
    public WebElement btnBuy;
	
	 public void verifyProductTitle(String prodTitle) {
		 HelperUtil.waitForElementToBeVisible(productTitle);
		 HelperUtil.waitForElementToBeClickable(btnBuy);
		 Assert.assertEquals(prodTitle, productTitle.getText());
		 System.out.println("\nPASSED: Product title verified as: "+prodTitle);
	    }
	
	 public void clickBuy() {		 
		 HelperUtil.clickElement(btnBuy); 
	    }
}
