package search.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EbayCartPage {
    private final WebDriver driver;

    @FindBy(xpath = ".//*[@class='mr10']")
    private WebElement inCartItem;

    public EbayCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public boolean isItemInCart(String requestedItem) {
        String itemName = inCartItem.getText().toUpperCase();
        if (itemName.contains(requestedItem.toUpperCase()))
            return true;
        else
            return false;
    }

}
