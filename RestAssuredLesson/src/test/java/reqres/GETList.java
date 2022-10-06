package reqres;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETList {
	
		
	@BeforeMethod
	
	public void createGETList() {
		
		RestAssured
			.when()
				.get("https://reqres.in/api/users")
			.then()
				.log().all();
		
	}
	
	@Test
	public void postData() {
		RestAssured
			.given()	
				.contentType("application/json")
			.when()
				.post()
			.then()
				.statusCode(200);
}
}	
