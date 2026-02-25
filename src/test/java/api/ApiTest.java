package api;

import com.fasterxml.jackson.core.JsonProcessingException;

import static io.restassured.RestAssured.given;

public class ApiTest  {

    static void main() throws JsonProcessingException {

        Post.postMethod();
        Put.putMethod();
        Get.getMethod();
        Delete.deleteMethod();


    }}
