package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
 
import org.testng.annotations.Test;
 
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class Activity1 {
 //Set Base URL
String ROOT_URI = "https://petstore.swagger.io/v2/pet";
//POST REQUEST
@Test(priority=1)
public void AddNewPet() {
   // Write the request body
	 // Create JSON request
    String reqBody = "{"
        + "\"id\": 7732,"
        + "\"name\": \"Rily\","
        + " \"status\": \"alive\""
    + "}";
   Response response = 
       given().contentType(ContentType.JSON) // Set headers
       .body(reqBody).when().post(ROOT_URI); // Send POST request

   // Print response of POST request
   String body = response.getBody().asPrettyString();
   System.out.println(body);
   
   // Assertion
   response.then().body("id", equalTo(7732));
   response.then().body("name", equalTo("Rily"));
   response.then().body("status", equalTo("alive"));
}
//GET REQUEST

@Test(priority=2)
public void getPetInfo() {
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .when().pathParam("petId", "7732") // Set path parameter
        .get(ROOT_URI + "/{petId}"); // Send GET request

    // Assertion
    response.then().body("id", equalTo(7732));
    response.then().body("name", equalTo("Rily"));
    response.then().body("status", equalTo("alive"));
}
//DELETE REQUEST
@Test(priority=3)
public void deletePet() {
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .when().pathParam("petId", "7732") // Set path parameter
        .delete(ROOT_URI + "/{petId}"); // Send DELETE request

    // Assertion
    response.then().body("code", equalTo(200));
    response.then().body("message", equalTo("7732"));
}
}
