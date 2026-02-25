package api;

import static io.restassured.RestAssured.given;

public class Put extends Post {

//    public static String globalId;

    public static void putMethod(){

        // PUT

        // Create request POJO
//        org.api.UpdateRequest request = new org.api.UpdateRequest();
//        String ranString = RandomStringUtils.randomAlphabetic(4);
//        request.setEmployeeName("Bharath Kumar" +" "+ ranString);
//        request.setProjectName("ABC");
//        request.set_id(globalId);
//
//        // PUT request
//        Response response =
////                given()
////                .contentType(ContentType.JSON)
////                .pathParam("id", globalId)
////                .body(request)
////                //.when();
////          //      .put(org.api.BaseURI.updateURL + "/{id}");
////       // System.out.println(org.api.BaseURI.updateURL + "/" + globalId);
//
//
//        // Print status & raw JSON
//        System.out.println("Status Code: " + response.getStatusCode());
//        System.out.println("Raw Response:");
//        System.out.println(response.asPrettyString());
//
//        // Map response to POJO
//        org.api.UpdateResponse updateResponse =
//                response.as(org.api.UpdateResponse.class);
//
//        // Access fields
//        System.out.println("Name: " + updateResponse.getEmployeeName());
//        System.out.println("ProjectName: " + updateResponse.getProjectName());
//        System.out.println("Id is :" + updateResponse.get_id());
    }

    public static void main() {
        putMethod();
    }
}


