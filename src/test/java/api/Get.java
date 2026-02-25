package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Get {

    public static void getMethod() throws JsonProcessingException {

        //GET REQUEST

        Response response =
                         given()
                        .baseUri(BaseURI.TRAININGS).contentType(ContentType.JSON)
                        .when()
                        .request(Method.GET, "/api/trainings");


        ObjectMapper objectMapper= new com.fasterxml.jackson.databind.ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        List<UserResponse> userResponse = response.jsonPath().getList("", UserResponse.class);

        System.out.println("Status Code: " + response.getStatusCode());

        for (UserResponse user : userResponse) {
            System.out.println(objectMapper.writeValueAsString(user));
        }
    }

    static void main() throws JsonProcessingException {
        getMethod();
    }
}
