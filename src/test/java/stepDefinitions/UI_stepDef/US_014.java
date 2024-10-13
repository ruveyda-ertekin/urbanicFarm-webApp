package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ReusableMethods;

public class US_014 extends CommonPage {

    @When("the user scrolls down the page until the Contribution to the Environment and Society text is visible")
    public void theUserScrollsDownThePageUntilTheContributionToTheEnvironmentAndSocietyTextIsVisible() {
        ReusableMethods.scrollToElement(getHomePage().contributionToTheEnvironmentAndSocietyHeading);
        Assert.assertTrue("Contribution to the Environment and Society text is not visible.", getHomePage().contributionToTheEnvironmentAndSocietyHeading.isDisplayed());
    }

    @And("the Register Now button should be clickable")
    public void theRegisterNowButtonShouldBeClickable() {
        Assert.assertTrue("Register Now button is not clickable.", getHomePage().registerNowMiddleButton.isEnabled());
    }


}
