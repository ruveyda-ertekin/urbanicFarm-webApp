package stepDefinitions.API_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base_URL.urbanicFarm_baseURL.specUrbanicFarm;
import static io.restassured.RestAssured.given;

public class US_102 {
    Response response;
    int sellerRates;
    String phpSessId;
    JsonPath jsonPath;
    Map<String, String> body = new HashMap<>();

    @When("the user sends a POST request to the getRates endpoint")
    public void theUserSendsAPOSTRequestToTheGetRatesEndpoint() {

        // Set the base URI for the API
        RestAssured.baseURI = "https://test.urbanicfarm.com";

        // Prepare the request body
        String sellerId = "{\"sellerId\":\"1180\"}";

        response = given().
                header("cookie", "PHPSESSID=" + phpSessId).
                body(sellerId).
                post("https://test.urbanicfarm.com/api/account/feedback/seller/getRates");

        response.prettyPrint();

    }

    @And("the response should contain the seller rates")
    public void theResponseShouldContainTheSellerRates() {

        // Extract the list of "rate" values from the response
        List<Integer> rates = response.jsonPath().getList("productFeedback.rate", Integer.class);

        // Assert that none of the "rate" values are null and print each rate
        for (Integer rate : rates) {
            Assert.assertNotNull("Rate value should not be null", rate);
            System.out.println("Rate: " + rate); // Print the rate value
        }

        // Optional: Print the entire response for debugging
        System.out.println("Full Response: " + response.asString());
    }



}
