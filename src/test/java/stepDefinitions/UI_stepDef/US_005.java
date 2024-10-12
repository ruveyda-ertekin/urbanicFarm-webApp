package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_005 extends CommonPage {
    @When("the relevant Explore button should be clickable")
    public void theRelevantExploreButtonShouldBeClickable() {
        Assert.assertTrue("Explore button is not visible.", getHomePage().exploreButton.isDisplayed());
        Assert.assertTrue("Explore button is not clickable.", getHomePage().exploreButton.isEnabled());
    }

    @And("the user clicks on the Explore link")
    public void theUserClicksOnTheExploreLink() {
        getHomePage().exploreButton.click();
    }

    @Then("the relevant Explore page should be visible")
    public void theRelevantExplorePageShouldBeVisible() {
        Assert.assertTrue("Explore page is not visible.", getExplorePage().explorePageText.isDisplayed());
    }
}
