package steps;

import api.BaseURI;
import api.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class GithubSteps {

    Response response;
    String token = ConfigReader.get("github.token");


    public void launchEndpoint() {
        RestAssured.baseURI = BaseURI.githubPostRequest;


    }

    public void sendPostRequest() {
        String requestBody = "{ \"title\": \"BDD Issue\", \"body\": \"Created using Cucumber\" }";

        System.out.println("The Token is :" + token);
        response =
                given()
                        .header("Authorization", "Bearer " + token)
                        .header("Accept", "application/vnd.github+json")
                        .body(requestBody)
                        .when()
                        .post("repos/bharathamk24-02/Automation/issues")
                        .then()
                        .log().all()   // 🔥 Add this
                        .extract().response();
    }


    public void verifyStatusCode(int expectedStatusCode) {
        assertEquals(expectedStatusCode, response.getStatusCode());
    }
}
