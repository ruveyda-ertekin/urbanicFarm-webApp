package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AboutUsPage extends CommonPage{

    @FindBy(xpath = "(//h2[@class='Slider_text__2tB3Y Slider_title__1RahK'])[5]")
    public WebElement aboutPageSliderText;

    @FindBy(xpath = "//h2[normalize-space()='OUR SERVICES']")
    public WebElement aboutPageTitle;

    public AboutUsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
