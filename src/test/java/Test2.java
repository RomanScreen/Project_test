
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Test2 {
    @Test
    public void getURL(){

        given()
                .header("x-vkusvill-token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJjYXJkIjoiRjQ4MDYzNiIsInZlcnNpb24iOjJ9.qbk-dIduopKqnV9Tg3fM1veUSb88V1MmM1YsXsyvmFm16ASn9psrnR3IGhbDxCnDG8nK_tbFM6P56HC85qCdBeERhRWDPnD5FFqPIWNScJXBL90kz5_kytZYKAW-YGz-IZcLarZaDKhelGAXkEsnhFQMpC7cbTS55bLWqnSIPNM")
                .header("x-vkusvill-source", "3")
                .header("x-vkusvill-version", "3.11.0 (5281)")
                .header("x-vkusvill-device", "ios")
                .baseUri("https://test-basket.fullstack.vkusvill.ru/api/v1")
                .basePath("/cart/")
                .contentType(ContentType.JSON)
                .when().get()
                .then()
                .statusCode(200)
                .body("data.cart.number", equalTo("f480636"))
                .body("data.cart.shop_id", equalTo(999));

    }

    //private RequestSpecification baseUri(String url) {
    }

