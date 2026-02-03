package Project;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.Response;
import org.testng.Reporter;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;

public class GitHubProject 
{
	RequestSpecification reqSpec;
	
	    private String sshKey;
	    private int sshKeyId;
	    private final String GITHUB_TOKEN = "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";
	    
	    @BeforeClass
	    public void setup()
	    {
	        sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIKNXsC0a/7WuedKXDePzGI4gH3QFIYntEv1RB3fpIFO4 azuread\\atmakuruphaneendra@IBM-0a59f08ee05";

	    	reqSpec = new RequestSpecBuilder()
	    			 .setBaseUri("https://api.github.com")
	    			 .setContentType(ContentType.JSON)
	    			 .addHeader("Authorization","token " + GITHUB_TOKEN)
	    			 .build();
	    }
	    @Test(priority = 1)
	    public void addSshKey() {
	        
	        Map<String, Object> reqbody = new HashMap<>();
	        reqbody.put("title", "TestAPIKey");
	        reqbody.put("key", sshKey); 
	 
	        Response response = given()
	                .spec(reqSpec)
	                .body(reqbody)
	                .when()
	                .post("/user/keys");
	 
	        if (response.getStatusCode() != 201) {
	            System.out.println("Detailed Error: " + response.asPrettyString());
	        }
	 
	        Assert.assertEquals(response.getStatusCode(), 201, "JSON parsing failed or key is invalid.");
	 
	        sshKeyId = response.then().extract().path("id");
	        Reporter.log("Successfully added SSH Key with ID: " + sshKeyId);
	    }
	    
	    @Test(priority = 2, dependsOnMethods = "addSshKey")
	    public void getSshKey() {
	        Response response = given()
	                .spec(reqSpec)
	                .pathParam("keyId", sshKeyId)
	                .when()
	                .get("/user/keys/{keyId}");
	        Reporter.log("GET Response: " + response.asPrettyString());
	        Assert.assertEquals(response.getStatusCode(), 200, "GET status code should be 200");
	        Assert.assertEquals((int)response.path("id"), sshKeyId, "IDs do not match!");
	    }
	 
	    @Test(priority = 3, dependsOnMethods = "getSshKey")
	    public void deleteSshKey() {
	        Response response = given()
	                .spec(reqSpec)
	                .pathParam("keyId", sshKeyId)
	                .when()
	                .delete("/user/keys/{keyId}");
	        Reporter.log("DELETE Response Status: " + response.getStatusCode());
	        Assert.assertEquals(response.getStatusCode(), 204, "DELETE status code should be 204");
	    }
}
