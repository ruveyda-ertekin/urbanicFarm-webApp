package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CommonPage;

public class US_010 extends CommonPage {
    @When("the relevant Get fresh produce button should be clickable")
    public void theRelevantGetFreshProduceButtonShouldBeClickable() {
        getHomePage().getFreshProduceButton.isEnabled();
    }

    @And("the user clicks on the Get fresh produce link")
    public void theUserClicksOnTheGetFreshProduceLink() {
        getHomePage().getFreshProduceButton.click();
    }
}
