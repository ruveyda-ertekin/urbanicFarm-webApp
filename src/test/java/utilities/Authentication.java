package utilities;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {

    public static String token;
    public static JsonPath jsonPath;
    public static String phpSessid;
    public static String cookie;

    public static String generateToken() {
        Map<String, Object> body = new HashMap<>();
        body.put("email", "buyer_urban@mailsac.com");
        body.put("password", "VHt*zzt*wQNu6XS");

        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .post("https://test.urbanicfarm.com/api/public/login");

        JsonPath jsonPath = response.jsonPath();
        return jsonPath.getString("token"); // Return only the token as a String
    }

    public static String generatePhpSessid() {
        Map<String, Object> body = new HashMap<>();
        body.put("email", "buyer_urban@mailsac.com");
        body.put("password", "VHt*zzt*wQNu6XS");

        Response response = given()
                .contentType(ContentType.JSON)
                .body(body)
                .post("https://test.urbanicfarm.com/api/public/login");

        cookie = "PHPSESSID=" + response.cookies().get("PHPSESSID");
        response.prettyPrint();

        return cookie;
    }
}
