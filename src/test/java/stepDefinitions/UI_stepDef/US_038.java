package stepDefinitions.UI_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pages.CommonPage;
import utilities.ConfigurationReader;
import utilities.ReusableMethods;

import static stepDefinitions.Hooks.driver;

public class US_038 extends CommonPage {

    private static final Logger logger = LogManager.getLogger(US_038.class);
    String loginPageURL = "https://test.urbanicfarm.com/auth/login";

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driver.get(loginPageURL);
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {

        getLoginPage().emailButton.sendKeys(ConfigurationReader.getProperty("buyerEmail"));
        getLoginPage().passwordButton.sendKeys(ConfigurationReader.getProperty("buyerPassword"));
    }

    @And("the user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {

        getLoginPage().loginButton.click();
        System.out.println("driver.getCurrentUrl() " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() " + driver.getTitle());
    }

    @Then("the user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() throws InterruptedException {

        ReusableMethods.waitForClickabilityWithElement(getHomePage().zipCodeCloseButton, 3000);

        // Expected values
        String expectedHomePageURL = "https://test.urbanicfarm.com/account/weekly-order";

        // Get actual values from the browser
        String actualHomePageURL = driver.getCurrentUrl();

        // Assertion for URL
        System.out.println("Verifying the user is on the correct home page URL.");
        Assert.assertEquals("Verifying the user is on the correct home page URL", expectedHomePageURL, actualHomePageURL);
        logger.info("Successfully logged in and navigated to the correct page: " + actualHomePageURL);

    }
}
