package api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public  class Delete {

    public static void deleteMethod() {

        // DELETE

        String trainingId = "6984ece5aee700362209e231";

        Response response =
                given()
                        .when()
                        .delete(BaseURI.TRAININGS+ trainingId)
                        .then().log().all().extract().response();


        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.asString());
    }

    static void main() {
        deleteMethod();
    }
}


