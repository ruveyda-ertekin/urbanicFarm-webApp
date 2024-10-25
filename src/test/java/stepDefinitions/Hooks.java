package stepDefinitions;

import base_URL.urbanicFarm_baseURL;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import utilities.Authentication;
import utilities.Driver;

public class Hooks {

    public static WebDriver driver;
    public static CommonPage commonPage;
    public static Actions actions;
    public static boolean isHeadless = false;
    public static String browserType = "chrome";
    public static boolean isFullScreen = true;
    public static int width;
    public static int height;
    public static Response response;

    @Before("@API")
    public void setUpApi() {
        urbanicFarm_baseURL.setUpUrbanicFarm(); // Sets up base URL
        Authentication.generateToken(); // Generates and stores token

        // Attach the token to spec for future requests
        urbanicFarm_baseURL.specUrbanicFarm.header("Authorization", "Bearer " + Authentication.token);
    }

    @Before(value = "@headless", order = 0)
    public void setIsHeadless() {
        isHeadless = true;
    }

    @Before(value = "@firefox", order = 0)
    public void setIsFirefox() {
        browserType = "firefox";
    }

    @Before(value = "@iPhone12", order = 0)
    public void setiPhone12() {
        isFullScreen = false;
        width = 390;
        height = 844;
    }

    @Before(order = 1, value = "@UI")
    public void setup() {

        driver = Driver.getDriver();
        commonPage = new CommonPage() {
        };
        actions = new Actions(driver);
    }

    @After(value = "@UI")
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshots");
        }
        Driver.closeDriver();
    }

}
