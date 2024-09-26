package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends CommonPage {

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement emailButton;
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
