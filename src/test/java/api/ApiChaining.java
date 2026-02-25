package api;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class ApiChaining {

//    String baseURI = "https://reqres.in/api";

    public void post(){
    String id = "";
            given()
                    .contentType(ContentType.JSON)
                    .body("""
    {
      "name": "Bharath",
      "job": "QA Engineer"
    }
    """)
                    .when()
                    .post("/users")
                    .then()
                    .statusCode(201)
                    .body("name", equalTo("Bharath"))
                    .extract()
                    .path("id");

System.out.println("Created ID: " + id);
    }
public void get() {
    String id = "";
    given()
                .pathParam("id", id)
                .when()
                .get("/users/{id}")
                .then()
                .statusCode(200)
                .log().all();
    }


    public void put(){
        String id = "";
        given()
                .contentType(ContentType.JSON)
                .pathParam("id", id)
                .body("""
    {
      "name": "Bharath",
      "job": "Senior QA"
    }
    """)
                .when()
                .put("/users/{id}")
                .then()
                .statusCode(200)
                .body("job", equalTo("Senior QA"));
    }


    public void delete(){
        String id = "";
        given()
                .pathParam("id", id)
                .when()
                .delete("/users/{id}")
                .then()
                .statusCode(204);
    }
    static void main() {
        ApiChaining apiChaining = new ApiChaining();
        apiChaining.post();
        apiChaining.get();
        apiChaining.put();
        apiChaining.delete();

    }
}
