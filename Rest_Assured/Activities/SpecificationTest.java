package examples;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SpecificationTest {
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
				expectResponseTime(lessThanOrEqualTo(3000L)).
				build();		
	}
  @Test(priority = 1)
  public void postRequest() {
	  //Create Request Body
	  Map<String, Object> reqBody = new HashMap<String, Object>();
	  reqBody.put("id", 2345);
	  reqBody.put("name", "Ray");
	  reqBody.put("status","alive");
	  //Send request, save response
	  Response response = 
			  given().spec(requestSpec).body(reqBody).
			  when().post();
	  //Extract id from the response
	  petId = response.then().extract().path("id");
	  //Assertions
	  response.then().spec(responseSpec).
	  body("name", equalTo("Ray")).
	  body("status",equalTo("alive"));
  }
  @Test(priority = 2)
  public void getRequest() {
	  given().spec(requestSpec).pathParam("petId", petId).
	  when().get("/{petId}").
	  then().spec(responseSpec).
	  body("status",equalTo("alive"));
  }
  @Test(priority = 3)
  public void deleteRequest() {
	  //Send request, get Response, assert response
	  given().spec(requestSpec).pathParam("petId", petId).
	  when().delete("/{petId}").
	  then().spec(responseSpec).
	  body("message",equalTo(""+petId));
  }
}
