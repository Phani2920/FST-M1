package Activities;


import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import java.util.HashMap;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Activity1 {
	String url = "https://petstore.swagger.io/v2/pet";
	String urlpar = "https://petstore.swagger.io/v2/pet/{petId}";
	
  @Test(priority = 1)
  public void addNewPet()   
  {
	  
	  HashMap<String, Object> reqBody = new HashMap<String,Object>();
		reqBody.put("id", 77236);
		reqBody.put("name", "Riley");
		reqBody.put("status", "alive");
		
		Response response = given()
				            .contentType(ContentType.JSON)
				            .when().body(reqBody).post(url);
		response.then().body("id", equalTo(77236));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status",equalTo("alive"));
				
}
  @Test(priority = 2)
  public void getPet() 
  {
	  
	  Response response =  given()
			              .contentType(ContentType.JSON)
				            .when().pathParam("petId",77236).get(urlpar);
	  
		response.then().body("id", equalTo(77236));
		response.then().body("name", equalTo("Riley"));
		response.then().body("status", equalTo("alive"));
		response.then().statusCode(200);
  }
  
  @Test(priority =3)
  public void deletePet()
  {
	  Response response =  given()
              .contentType(ContentType.JSON).pathParam("petId",77236)
	            .when().delete(urlpar);
	  
	   response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("77236"));
  }
  
}
