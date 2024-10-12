package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_007 extends CommonPage {
    @When("the relevant Contact Us button should be clickable")
    public void theRelevantContactUsButtonShouldBeClickable() {
        Assert.assertTrue("Contact Us button is not clickable.", getHomePage().aboutUsButton.isEnabled());
    }

    @And("the user clicks on the Contact Us link")
    public void theUserClicksOnTheContactUsLink() {
        getHomePage().contactUsButton.click();
    }

    @Then("the relevant Contact Us page should be visible")
    public void theRelevantContactUsPageShouldBeVisible() {
        Assert.assertTrue("Contact Us Page is not visible.", getContactUsPage().contactUsPageTitle.isDisplayed());

    }
}
