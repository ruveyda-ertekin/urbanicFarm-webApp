package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage extends CommonPage{

    @FindBy(xpath = "//a[@class='col-6 AuthLayout_tab_header__a1Lli AuthLayout_tab_header_active__38vIi']")
    public WebElement registerText;
    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
