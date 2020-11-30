package pl.gov.nfz;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class QuarkusServiceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/quarkus-start")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}