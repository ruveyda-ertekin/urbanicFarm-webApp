package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FarmersMarketPage extends CommonPage{

    public FarmersMarketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Farmers Market']")
    public WebElement farmersMarketButton;

    @FindBy(xpath = "//div[@class='text-center CheckDistrictModal_sectionHeading__3Heis']")
    public WebElement farmersMarketPagePopUpButton;



}
