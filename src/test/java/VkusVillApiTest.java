import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VkusVillApiTest {

    @Test
    public void testGetProducts() {
        // Устанавливаем базовый URI для запросов
        RestAssured.baseURI = "https://www.vkusvill.ru/api/";

        // Выполняем GET запрос к API продуктов и сохраняем ответ
        Response response = RestAssured
                .given()
                .when()
                .get("products") // замените на фактический endpoint
                .then()
                .extract()
                .response();

        // Проверяем статус код ответа
        Assert.assertEquals(response.getStatusCode(), 200, "Статус код не 200");

        // Проверка содержимого ответа (например, наличие ключей)
        Assert.assertTrue(response.jsonPath().getList("data").size() > 0, "Список продуктов пуст");
    }
}