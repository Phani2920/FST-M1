package Activities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class Activity2 {
	
	String url = "https://petstore.swagger.io/v2/user";
	String pathUrl = "https://petstore.swagger.io/v2/user/{username}";

  @Test(priority =1)
  public void addNewUser() throws IOException 
  
  {
	  FileInputStream inputJSON = new FileInputStream("src/test/resources/userinfo.json");
	  Response response = given()
			              .contentType(ContentType.JSON)
			              .when().body(inputJSON).post(url);
	  inputJSON.close();
			             
	// Assertion
			response.then().body("code", equalTo(200));
			response.then().body("message", equalTo("2341"));
  }
  @Test(priority =2)
  public void getUser() 
  {
	  File outputJSON = new File("src/test/resources/userGETResponse.json");
	  
	  Response response = given()
			              .contentType(ContentType.JSON)
			              .when().pathParam("username","pavanpspk")
			              .get(pathUrl);
	  
	  String resBody = response.getBody().asPrettyString();
	  
		try {
			outputJSON.createNewFile();
			FileWriter writer = new FileWriter(outputJSON.getPath());
			writer.write(resBody);
			writer.close();
		} catch (IOException excp) {
			excp.printStackTrace();
		}
		response.then().body("id", equalTo(2341));
		response.then().body("username", equalTo("pavanpspk"));
		response.then().body("firstName", equalTo("Pavan"));
		response.then().body("lastName", equalTo("PSPK"));
		response.then().body("email", equalTo("pavanpspk@mail.com"));
		response.then().body("password", equalTo("password123"));
		response.then().body("phone", equalTo("9812763450"));
	  
  }
  
  @Test(priority =3)
  
  public void deleteuser()
  {
	  
		Response response = given()
				.baseUri("https://petstore.swagger.io/v2/user") // Set base URI
				.header("Content-Type", "application/json") // Set headers
				.pathParam("username", "pavanpspk") // Add path parameter
				.when().delete("/{username}"); // Send POST request
		
		response.then().body("code", equalTo(200));
		response.then().body("message", equalTo("pavanpspk"));
  }
  
  
}
