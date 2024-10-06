
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class TEST {
    @Test
    public void getURL(){

        given()
                .baseUri("https://swapi.dev/api/people/")
                .basePath("/1/")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .body("eye_color", equalTo("blue"));

    }

}

