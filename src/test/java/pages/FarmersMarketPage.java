package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FarmersMarketPage extends CommonPage {

    @FindBy(xpath = "//div[@class='text-center CheckDistrictModal_sectionHeading__3Heis']")
    public WebElement farmersMarketPagePopUpButton;

    public FarmersMarketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
