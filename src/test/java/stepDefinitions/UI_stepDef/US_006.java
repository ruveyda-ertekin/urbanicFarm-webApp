package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitFor;
import static utilities.ReusableMethods.waitForVisibility;

public class US_006 extends CommonPage {
    @When("the relevant About Us button should be clickable")
    public void theRelevantAboutUsButtonShouldBeClickable() {

        ReusableMethods.waitForClickabilityWithElement(getHomePage().aboutUsButton, 5);
        Assert.assertTrue("About Us button is not clickable.", getHomePage().aboutUsButton.isEnabled());
    }

    @And("the user clicks on the About Us link")
    public void theUserClicksOnTheAboutUsLink() {
        getHomePage().aboutUsButton.click();
    }

    @Then("the relevant About Us page should be visible")
    public void theRelevantAboutUsPageShouldBeVisible() {
        ReusableMethods.waitForPageToLoad(10);
        Assert.assertTrue("About Us page is not visible.", getAboutUsPage().aboutPageTitle.isDisplayed());
    }
}
