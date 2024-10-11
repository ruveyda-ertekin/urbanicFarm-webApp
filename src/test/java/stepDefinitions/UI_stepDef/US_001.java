package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.Given;
import pages.CommonPage;

import static stepDefinitions.Hooks.driver;

public class US_001 extends CommonPage {

    String baseURL = "https://test.urbanicfarm.com/";

    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
        driver.get(baseURL);
    }
}
