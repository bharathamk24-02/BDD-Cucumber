package steps;

import api.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;

import static io.restassured.RestAssured.given;

public class Training_steps {

    public static String globalId;

    public void createTraining() {

        PostRequest postRequest = new PostRequest();

        postRequest.setCourse("Computerscience");
        postRequest.setEmpId("501023890");
        postRequest.setEmployeeName("Arjun" + RandomStringUtils.randomAlphabetic(3));
        postRequest.setStartDate("2024-02-05");
        postRequest.setEndDate("2028-02-05");
        postRequest.setStatus("Completed");
        postRequest.setTrainerName("Balu");
        postRequest.setTrainingType("Udemy");
        postRequest.setPercentCompleted(80);
        postRequest.setProjectName("ABC");

        //org.api.Post Request

        Response response = given().contentType(ContentType.JSON)
                .body(postRequest)
                .when()
                .post(BaseURI.TRAININGS);

        // Print response
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body:");
        response.prettyPrint();

        // Extract _id
        globalId = response.jsonPath().getString("_id");
        System.out.println("Extracted Global ID: " + globalId);

        System.out.println("_________________________________________________________________");

    }

    public void updateTraining() {

        UpdateRequest request = new UpdateRequest();
        String ranString = RandomStringUtils.randomAlphabetic(4);
        request.setEmployeeName("Bharath Kumar" + " " + ranString);
        request.setProjectName("ABC");
        request.setStartDate("2024-02-05T00:00:00.000Z");
        request.setEndDate("2028-02-05T00:00:00.000Z");


        // PUT request
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .body(request)
                        .log().all().
                        when()
                        .put(BaseURI.updateURL + globalId);

        // Print status & raw JSON
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Raw Response:");
        System.out.println(response.asPrettyString());

        // Map response to POJO
        UpdateResponse updateResponse =
                response.as(UpdateResponse.class);

        // Access fields
        System.out.println("Name: " + updateResponse.getEmployeeName());
        System.out.println("ProjectName: " + updateResponse.getProjectName());

    }


    public static void getMethod() throws JsonProcessingException {


        //GET REQUEST

        Response response =
                given()
                        .baseUri(BaseURI.BASE)   // http://10.192.190.158:5002
                        .contentType(ContentType.JSON)
                        .pathParam("id", globalId)
                        .when()
                        .get("/api/trainings/{id}");


        if (response.getStatusCode() == 200) {
            System.out.println("******* The org.api.Get Response ************");
            UserResponse user = response.as(UserResponse.class);
            System.out.println("Employee Name: " + user.getEmployeeName());
            System.out.println("Project: " + user.getProjectName());
            System.out.println("ID: " + user.get_id());
        }

        System.out.println("_________________________________________________________________");

    }

    public static void deleteMethod() {

        // DELETE

        String trainingId = globalId;

        Response response =
                given()
                        .baseUri(BaseURI.BASE)   // http://10.192.190.158:5002
                        .pathParam("id", globalId)
                        .when()
                        .delete("/api/trainings/{id}");


        System.out.println("DELETE Status Code: " + response.getStatusCode());
        System.out.println("DELETE SuccessFully");


        System.out.println("_________________________________________________________________");

    }


}


