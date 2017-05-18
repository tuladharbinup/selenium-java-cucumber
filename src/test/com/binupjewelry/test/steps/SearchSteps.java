package com.binupjewelry.test.steps;
import com.binupjewelry.framework.base.DriverContext;
import com.binupjewelry.framework.config.Settings;
import com.binupjewelry.test.pages.CartPage;
import com.binupjewelry.test.pages.HomePage;
import com.binupjewelry.test.pages.SearchPage;
import cucumber.api.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by Binup on 5/15/2017.
 */
public class SearchSteps {

    HomePage homePage= new HomePage();
    SearchPage searchPage = new SearchPage();
    CartPage cartPage = new CartPage();

    @Given("^Customer is in binup-jewelry application$")
    public void customerIsLoggedIntoBinupJewelryApplication() throws Throwable {
        System.out.println("Navigating to test URL: " + Settings.AUTbaseURL);
        DriverContext.driver.get(Settings.AUTbaseURL);
        DriverContext.driver.manage().window().maximize();
    }

    @When("^I enter the following product name in the search box and click search$")
    public void i_enter_the_following_product_name_in_the_search_box_and_click_search(DataTable dTable) throws Throwable {
        List<List<String>> table =dTable.raw();
        homePage.searchProduct(table.get(1).get(1).toString()); //row(1).column(1)

    }

    @Then("^I see search result number$")
    public void i_see_search_result_number() throws Throwable {
        System.out.println("\nSearch result number: "+searchPage.getSearchResultNumber());
    }

    @Then("^I am able to click the product DETAILS buttton$")
    public void i_am_able_to_click_the_product_DETAILS_buttton() throws Throwable {
        searchPage.clickDetails();
    }

    @When("^I search the following products and add them to a cart$")
    public void iSearchTheFollowingProductsAndAddThemToACart(DataTable dataTable) throws Throwable {
        List<List<String>> table =dataTable.raw();

        //subList is used in the loop below to ignore the datatable row containing column names.
        for (List<String> item: table.subList( 1, table.size() )) {
            homePage.searchProduct(item.get(1).toString());
            System.out.println("\nSearch result number= "+searchPage.getSearchResultNumber()+", for product "+item.get(1).toString());
            searchPage.clickBuy();
            Thread.sleep(3000);
            cartPage.clickContiueShopping();

        }
    }

    @Then("^I see added item number in the cart$")
    public void iSeeAddedItemNumberInTheCart() throws Throwable {

        if (homePage.getCartItemCount()>0) {
            System.out.println("PASSED: Item Number Count In The Cart: " + homePage.getCartItemCount());
        }
        else  {
            System.out.println("FAILED: Item Number Count In The Cart: " + homePage.getCartItemCount());
        }
    }
}
