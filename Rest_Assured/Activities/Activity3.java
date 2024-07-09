package activities;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Activity3 {
		RequestSpecification requestSpec;
		ResponseSpecification responseSpec;
		int petId;
		
		@BeforeClass
		public void setUp() {
			//Request Specification
			requestSpec = new RequestSpecBuilder().
					setBaseUri("https://petstore.swagger.io/v2/pet").
					addHeader("Content-Type","application/json").
					build();
			//Response Specification
			responseSpec = new ResponseSpecBuilder().
					expectStatusCode(200).
					expectHeader("Content-Type","application/json").
					expectBody("status",equalTo("alive")).
					expectResponseTime(lessThanOrEqualTo(5000L)).
					build();		
		}
		@DataProvider
	    public Object[][] petInfoProvider() {
	        // Setting parameters to pass to test case
	        Object[][] testData = new Object[][] { 
	            { 1232, "Rose", "alive" }, 
	            { 1233, "Tim", "alive" }
	        };
	        return testData;
	    }
		@Test(priority = 1)
		  public void postRequest() {
		        String reqBody = "{\"id\": 1232, \"name\": \"Rose\", \"status\": \"alive\"}";
			  //Send request, save response
			  Response response = 
					  given().spec(requestSpec).body(reqBody).
					  when().post();
			  reqBody = "{\"id\": 1233, \"name\": \"Tim\", \"status\": \"alive\"}"; 
			//Send request, save response
			response = given().spec(requestSpec).body(reqBody).
					  when().post();
			// Assertions
	        response.then().spec(responseSpec);
		  }
		
		@Test(dataProvider = "petInfoProvider", priority=2)
		  public void getRequest(int petId, String name, String status) {
			Response response = given().spec(requestSpec).pathParam("petId", petId).
			  when().get("/{petId}");
			// Print response
		        System.out.println(response.asPrettyString());
		        // Assertions
		        response.then()
		        .spec(responseSpec) // Use responseSpec
		        .body("name", equalTo(name)); // Additional Assertion
		  }
		  @Test(dataProvider = "petInfoProvider",priority = 3)
		  public void deleteRequest(int petId, String name, String status) {
			  //Send request, get Response, assert response
			  Response response = given().spec(requestSpec).pathParam("petId", petId).
			  when().delete("/{petId}");
			// Assertions
		        response.then().body("code", equalTo(200));
		  }
}
