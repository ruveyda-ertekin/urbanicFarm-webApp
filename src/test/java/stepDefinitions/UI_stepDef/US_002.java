package stepDefinitions.UI_stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CommonPage;

import java.util.List;

public class US_002 extends CommonPage {

    @Then("the following headers should be visible from left to right:")
    public void theFollowingHeadersShouldBeVisibleFromLeftToRight(DataTable dataTable) {

        // Convert the DataTable to a List of Strings
        List<String> expectedHeaders = dataTable.asList();

        // Verify that each header is displayed and the text matches
        Assert.assertTrue("'Support the local food movement' header is not displayed.", getHomePage().supportTheLocalFoodMovementButton.isDisplayed());
        Assert.assertEquals(getHomePage().supportTheLocalFoodMovementButton.getText(), expectedHeaders.get(0));

        Assert.assertTrue("'Blog' header is not displayed.", getHomePage().blogButton.isDisplayed());
        Assert.assertEquals(getHomePage().blogButton.getText(), expectedHeaders.get(1));

        Assert.assertTrue("'Farmers Market' header is not displayed.", getHomePage().farmersMarketButton.isDisplayed());
        Assert.assertEquals(getHomePage().farmersMarketButton.getText(), expectedHeaders.get(2));

        Assert.assertTrue("'Explore' header is not displayed.", getHomePage().exploreButton.isDisplayed());
        Assert.assertEquals(getHomePage().exploreButton.getText(), expectedHeaders.get(3));

        Assert.assertTrue("'About Us' header is not displayed.", getHomePage().aboutUsButton.isDisplayed());
        Assert.assertEquals(getHomePage().aboutUsButton.getText(), expectedHeaders.get(4));

        Assert.assertTrue("'Contact Us' header is not displayed.", getHomePage().contactUsButton.isDisplayed());
        Assert.assertEquals(getHomePage().contactUsButton.getText(), expectedHeaders.get(5));

        Assert.assertTrue("'Login' header is not displayed.", getHomePage().loginButton.isDisplayed());
        Assert.assertEquals(getHomePage().loginButton.getText(), expectedHeaders.get(6));

        Assert.assertTrue("'Register' header is not displayed.", homePage.registerButton.isDisplayed());
        Assert.assertEquals(getHomePage().registerButton.getText(), expectedHeaders.get(7));
    }
}
