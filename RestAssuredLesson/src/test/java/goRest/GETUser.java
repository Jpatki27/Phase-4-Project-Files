package goRest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class GETUser {

	@Test
	
	public void getResource() {
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 8b526abd2d216c80af7641571d389cd04b062cecce2a8fabb435a0ddf63ae674")
			.when()
				.get("https://gorest.co.in/public/v2/users/2510")
			.then()
				.statusCode(200)
			.and()	
				.body("email", is("batman12367@gmail.com"));
				
	}

}
