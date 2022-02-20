import API.ResponseBodyFull;
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

    ResponseBodyFull actualText = given()
            .when()
            .get("/api/unknown/2")
            .then().log().all()
            .extract().as(ResponseBodyFull.class);

    Assert.assertEquals(actualText.getSupport().getText(), expectedText);

  }

}
