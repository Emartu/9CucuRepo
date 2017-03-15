package search.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayItemPage {
    private final WebDriver driver;

    @FindBy(xpath = "//a[@id='isCartBtn_btn']")
    private WebElement addToCartBtn;

    public EbayItemPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void addToCart() {
        addToCartBtn.click();
    }

}
