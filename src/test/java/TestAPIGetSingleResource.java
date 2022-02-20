import API.ResponseBodySupport;
import API.Specification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class TestAPIGetSingleResource {

  private final static String URL = "https://reqres.in/";

  @Test
  public void getSingleResourceAndCheckTextInBody() {
    Specification.installSpecification(Specification.requestSpecification(URL),
            Specification.responseSpecification(200));

    String expectedText = "To keep ReqRes free, contributions towards server costs are appreciated!";

    ResponseBodySupport actualText = given()
            .when()
            .get("/api/unknown/2")
            .then().log().all()
            .extract().body().jsonPath().getObject("support", ResponseBodySupport.class);

    Assert.assertEquals(actualText.getText(), expectedText);

  }

}
