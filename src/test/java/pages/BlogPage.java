package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlogPage extends CommonPage{

    public BlogPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[normalize-space()='Welcome to the Urbanic Farm Blog']")
    public WebElement blogPageTitle;
}
