package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExplorePage extends CommonPage {

    @FindBy(xpath = "//span[normalize-space()='Local seller near you']")
    public WebElement explorePageText;

    public ExplorePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
