package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_008 extends CommonPage {
    @When("the relevant Login button should be clickable")
    public void theRelevantLoginButtonShouldBeClickable() {
        Assert.assertTrue("Login button is not clickable.", getHomePage().loginButton.isEnabled());
    }

    @And("the user clicks on the Login link")
    public void theUserClicksOnTheLoginLink() {
        getHomePage().loginButton.click();
    }

    @Then("the relevant Login page should be visible")
    public void theRelevantLoginPageShouldBeVisible() {
        Assert.assertTrue("Login Page is not visible.", getLoginPage().loginText.isDisplayed());
    }
}
