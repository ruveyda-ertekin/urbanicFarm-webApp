package stepDefinitions.API_stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class US_100 {

    Map<String, Object> payload = new HashMap<>();
    String phpSessId;
    private String baseURL = "https://test.urbanicfarm.com/";
    private Response response;

    @Given("the API base URL is set to {string}")
    public void theAPIBaseURLIsSetTo(String baseURL) {
        baseURL = this.baseURL;
    }

    @Given("the user has a valid login payload")
    public void theUserHasAValidLoginPayload() {
        payload.put("email", "buyer_urban@mailsac.com");
        payload.put("password", "VHt*zzt*wQNu6XS");

    }

    @When("the user sends a POST request to the login endpoint")
    public void theUserSendsAPOSTRequestToTheLoginEndpoint() {
        response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post(baseURL + "api/public/login");

        response.prettyPrint();
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {

        Assert.assertEquals(statusCode, response.getStatusCode());

    }

    @And("the response should contain a token")
    public void theResponseShouldContainAToken() {
        String token = response.jsonPath().getString("token");
        Assert.assertNotNull("Token should be present", token);
        System.out.println("token:" + token);
    }

    @And("the user get PHPSESSID")
    public void theUserGetPHPSESSID() {
        phpSessId = response.cookies().get("PHPSESSID");
        System.out.println("PHPSESSID=" + phpSessId);
    }

    @And("the response should contain a email")
    public void theResponseShouldContainAEmail() {
        String email = response.jsonPath().getString("email");
        Assert.assertNotNull("email should be present", email);
    }

    @And("the response should contain a first_name")
    public void theResponseShouldContainAFirst_name() {
        String first_name = response.jsonPath().getString("first_name");
        Assert.assertNotNull("First name should be present", first_name);
    }

    @And("the response should contain a first_lastname")
    public void theResponseShouldContainAFirst_lastname() {
        String first_lastname = response.jsonPath().getString("first_lastname");
        Assert.assertNotNull("First lastname should be present", first_lastname);
    }

    @And("the response should contain a device_token")
    public void theResponseShouldContainADevice_token() {
        String device_token = response.jsonPath().getString("device_token");
        Assert.assertNotNull("device_token should be present", device_token);
    }
}
