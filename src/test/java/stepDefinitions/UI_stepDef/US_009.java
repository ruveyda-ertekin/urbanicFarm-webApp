package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_009 extends CommonPage {
    @When("the relevant Register button should be clickable")
    public void theRelevantRegisterButtonShouldBeClickable() {
        Assert.assertTrue("Register button is not clickable.", getHomePage().registerButton.isEnabled());
    }

    @And("the user clicks on the Register link")
    public void theUserClicksOnTheRegisterLink() {
        getHomePage().registerButton.click();
    }

    @Then("the relevant Register page should be visible")
    public void theRelevantRegisterPageShouldBeVisible() {
        Assert.assertTrue("Register Page is not visible.", getRegisterPage().registerText.isDisplayed());
    }
}
