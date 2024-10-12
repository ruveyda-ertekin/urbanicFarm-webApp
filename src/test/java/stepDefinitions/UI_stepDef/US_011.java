package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_011 extends CommonPage{
    @When("the user scrolls down the page")
    public void theUserScrollsDownThePage() {
        ReusableMethods.scrollToElement(getHomePage().sellYourProductsText);
    }


    @Then("the Sell Your Products text should be visible")
    public void theSellYourProductsTextShouldBeVisible() {
        Assert.assertTrue("Sell Your Products text is not visible.", getHomePage().sellYourProductsText.isDisplayed());
    }
}
