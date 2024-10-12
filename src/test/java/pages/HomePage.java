package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage extends CommonPage {

    @FindBy(xpath = "//div[@class='CheckDistrictModal_x-btn__sVOij']")
    public WebElement zipCodeCloseButton;
    @FindBy(xpath = "//a[text()='Support the local food movement']")
    public WebElement supportTheLocalFoodMovementButton;
    @FindBy(xpath = "//a[text()='Blog']")
    public WebElement blogButton;
    @FindBy(xpath = "//a[text()='Farmers Market']")
    public WebElement farmersMarketButton;
    @FindBy(xpath = "//a[text()='Explore']")
    public WebElement exploreButton;
    @FindBy(xpath = "//a[@class='Navbar_textLink__f6_Al mr-4'][normalize-space()='About Us']")
    public WebElement aboutUsButton;
    @FindBy(xpath = "//a[text()='Contact Us']")
    public WebElement contactUsButton;
    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerButton;
    @FindBy(xpath = "//button[normalize-space()='Get fresh produce']")
    public WebElement getFreshProduceButton;
    @FindBy(xpath = "//p[text()='Sell Your Products']")
    public WebElement sellYourProductsText;

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
