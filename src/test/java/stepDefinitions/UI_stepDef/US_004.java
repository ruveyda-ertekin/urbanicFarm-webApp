package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;

public class US_004 extends CommonPage {


    @When("the relevant Farmers Market button should be clickable")
    public void theRelevantFarmersMarketButtonShouldBeClickable() {
        Assert.assertTrue("Farmers Market button is not clickable", getHomePage().farmersMarketButton.isEnabled());
    }

    @And("the user clicks on the Farmers Market link")
    public void theUserClicksOnTheFarmersMarketLink() {
        getHomePage().farmersMarketButton.click();
    }

    @Then("the relevant Farmers Market page should be visible")
    public void theRelevantFarmersMarketPageShouldBeVisible() {
        Assert.assertTrue("Farmers Market page is not visible.", getFarmersMarketPage().farmersMarketPagePopUpButton.isDisplayed());
    }
}
