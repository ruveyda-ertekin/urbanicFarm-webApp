package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_013 extends CommonPage {

    @When("the user scrolls down the page until the {string} text is visible")
    public void theUserScrollsDownThePageUntilTheTextIsVisible(String expectedText) {

        ReusableMethods.scrollToElement(getHomePage().sellYourProductsText);
        Assert.assertTrue("'" + expectedText + "' text is not visible.", getHomePage().sellYourProductsText.isDisplayed());

    }

    @And("the SELL button should be clickable")
    public void theSELLButtonShouldBeClickable() {

        Assert.assertTrue("SELL button is not clickable.", getHomePage().sellButton.isEnabled());
    }

    @And("the SHARE button should be clickable")
    public void theSHAREButtonShouldBeClickable() {
        Assert.assertTrue("SHARE button is not clickable.", getHomePage().shareButton.isEnabled());
    }

    @And("the TRADE button should be clickable")
    public void theTRADEButtonShouldBeClickable() {
        Assert.assertTrue("TRADE button is not clickable.", getHomePage().tradeButton.isEnabled());
    }

}
