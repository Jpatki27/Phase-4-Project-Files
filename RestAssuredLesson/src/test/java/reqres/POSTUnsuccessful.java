package reqres;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POSTUnsuccessful {
	
	public static HashMap<String, String> map= new HashMap<String, String>();
	
	@BeforeMethod
	
	public void createPUTUpdate() {
		map.put("email", "sydney@fife");
		RestAssured.baseURI = "https://reqres.in";
		RestAssured.basePath = "/api/register";
	}

	@Test
	public void postData() {
		RestAssured
			.given()	
				.contentType("application/json")
			.when()
				.post()
			.then()
				.statusCode(400);
}

}
