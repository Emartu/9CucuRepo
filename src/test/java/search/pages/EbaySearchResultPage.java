package search.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySearchResultPage {

    private final WebDriver driver;

    @FindBy(xpath = ".//*[@id='ListViewInner']/li[1]/div")
    private WebElement item;

    public EbaySearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void clickOnItem() {
        item.click();

    }
}
