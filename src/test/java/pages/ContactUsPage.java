package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUsPage extends CommonPage {
    @FindBy(xpath = "//h2[@class='ContactUs_title__elsQ3']")
    public WebElement contactUsPageTitle;

    public ContactUsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
