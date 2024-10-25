package base_URL;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class urbanicFarm_baseURL {

    public static RequestSpecification specUrbanicFarm;

    public static void setUpUrbanicFarm() {

        specUrbanicFarm = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                setBaseUri("https://test.urbanicfarm.com/").
                build();
    }
}
