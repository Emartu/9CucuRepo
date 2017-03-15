package search.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EbayMainPage {
    private final WebDriver driver;

    @FindBy(xpath = ".//*[@id='gh-ac']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id='gh-btn']")
    private WebElement searchBtn;

    public EbayMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void doSearch(String searchRequest) {
        searchField.sendKeys(searchRequest);
        searchBtn.click();
    }

}
