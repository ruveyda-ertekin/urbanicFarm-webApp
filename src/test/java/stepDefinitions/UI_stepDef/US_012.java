package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_012 extends CommonPage {
    @When("the user scrolls down the page until they see the text")
    public void theUserScrollsDownThePageUntilTheySeeTheText() {
        ReusableMethods.scrollToElement(getHomePage().forFreeText);
    }

    @Then("Backyard gardeners and farmers join the Movement For Free! text should be visible")
    public void backyardGardenersAndFarmersJoinTheMovementForFreeTextShouldBeVisible() {
        Assert.assertTrue("Backyard gardeners and farmers join the Movement For Free! text is not visible.", getHomePage().forFreeText.isDisplayed());
    }

    @And("Register now! button should be clickable")
    public void registerNowButtonShouldBeClickable() {
        Assert.assertTrue("Register now! button is not clickable.", getHomePage().registerNowButton.isEnabled());
    }
}
