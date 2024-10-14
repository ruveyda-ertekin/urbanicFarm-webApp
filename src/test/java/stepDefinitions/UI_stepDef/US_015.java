package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_015 extends CommonPage {
    @When("the user scrolls down the page until the Reduce waste, strengthen your community heading is visible")
    public void theUserScrollsDownThePageUntilTheReduceWasteStrengthenYourCommunityHeadingIsVisible() {
        ReusableMethods.scrollToElement(getHomePage().reduceWasteHeading);
        ReusableMethods.waitForVisibility(getHomePage().reduceWasteHeading, 5);
        Assert.assertTrue("Reduce waste, strengthen your community heading is not visible.", getHomePage().reduceWasteHeading.isDisplayed());
    }

    @And("What's Near You button should be clickable")
    public void whatSNearYouButtonShouldBeClickable() {
        ReusableMethods.waitForClickabilityWithElement(getHomePage().whatsNearYouButton, 5);
        Assert.assertTrue("What's Near You button is not clickable.", getHomePage().whatsNearYouButton.isEnabled());
        ReusableMethods.waitFor(1);
        getHomePage().whatsNearYouButton.click();
    }

    @Then("the relevant What's Near You page should open")
    public void theRelevantWhatSNearYouPageShouldOpen() {
        ReusableMethods.waitForPageToLoad(5);
        Assert.assertTrue("Relevant What's Near You page is not open.", getExplorePage().explorePageText.isDisplayed());
    }

    @And("Post Your Goods button should be clickable")
    public void postYourGoodsButtonShouldBeClickable() {
        ReusableMethods.waitForClickabilityWithElement(getHomePage().postYourGoodsButton, 5);
        Assert.assertTrue("Post Your Goods button is not clickable.", getHomePage().postYourGoodsButton.isEnabled());
        ReusableMethods.waitFor(1);
        getHomePage().postYourGoodsButton.click();
    }

    @Then("the relevant Post Your Goods page should open")
    public void theRelevantPostYourGoodsPageShouldOpen() {
        ReusableMethods.waitForPageToLoad(5);
        Assert.assertTrue("Relevant Post Your Goods page is not open", getRegisterPage().registerText.isDisplayed());
    }
}
