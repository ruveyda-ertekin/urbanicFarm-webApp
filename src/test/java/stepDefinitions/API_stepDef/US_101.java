package stepDefinitions.API_stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.Authentication;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US_101 {

    private String token;
    private Response response;

    @When("the user sends POST request to login as a buyer")
    public void theUserSendsPOSTRequestToLoginAsABuyer() {

        // Generate token using Authentication class
        String token = Authentication.generateToken();

        // For validation, make a direct call to capture the response
        Map<String, Object> loginPayload = new HashMap<>();
        loginPayload.put("email", "buyer_urban@mailsac.com");
        loginPayload.put("password", "VHt*zzt*wQNu6XS");

        response = given()
                .contentType("application/json")
                .body(loginPayload)
                .post("https://test.urbanicfarm.com/api/public/login");

    }

    @Then("the user asserts login response data")
    public void theUserAssertsLoginResponseData() {

        // Check that the response status code is 200
        response.then().statusCode(200);

        // Validate "success" field in response
        boolean success = response.jsonPath().getBoolean("success");
        Assert.assertTrue("Login was not successful", success);

        // Validate the presence of the token
        String token = response.jsonPath().getString("token");
        Assert.assertNotNull("Token should not be null", token);

        // Save the token for future use through Authentication class
        Authentication.token = token;


    }
}
