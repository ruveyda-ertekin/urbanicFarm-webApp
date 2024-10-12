package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_003 extends CommonPage {

    @When("the relevant Blog button should be clickable")
    public void theRelevantBlogButtonShouldBeClickable() {
        // Assert that the blog button is clickable
        Assert.assertTrue("Blog button is not clickable.", getHomePage().blogButton.isEnabled());
    }

    @And("the user clicks on the Blog link")
    public void theUserClicksOnTheBlogLink() {
        getHomePage().blogButton.click();
    }

    @Then("the relevant Blog page should be visible")
    public void theRelevantBlogPageShouldBeVisible() {
        // Assert that the blog page title is displayed
        Assert.assertTrue("Blog page is not visible.", getBlogPage().blogPageTitle.isDisplayed());
    }

}
