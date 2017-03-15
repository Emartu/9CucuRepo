package search.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import search.pages.*;
import search.selenium.BaseSelenium;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BaseStepDef {
    private EbayMainPage ebayMainPage = new EbayMainPage(BaseSelenium.Instance);
    private EbaySearchResultPage ebaySearchResultPage = new EbaySearchResultPage(BaseSelenium.Instance);
    private EbayItemPage ebayItemPage = new EbayItemPage(BaseSelenium.Instance);
    private EbayCartPage ebayCartPage = new EbayCartPage(BaseSelenium.Instance);

    @Given("^I set search request \"([^\"]*)\" and perform search$")
    public void iSetSearchRequest(String searchRequest) {
        BaseSelenium.Instance.get("http://ebay.com");
        ebayMainPage.doSearch(searchRequest);
    }

    @When("^I add to cart$")
    public void iPerformSearch() {
        ebaySearchResultPage.clickOnItem();
        ebayItemPage.addToCart();
    }

    @Then("^item \"([^\"]*)\" is added to Cart$")
    public void isProceedToCheckOutDisplayed(String s) {
        assertTrue(ebayCartPage.isItemInCart(s));
    }
}
