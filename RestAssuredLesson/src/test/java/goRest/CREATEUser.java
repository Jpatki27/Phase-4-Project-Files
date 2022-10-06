package goRest;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import log4jproject.BaseTest;

public class CREATEUser extends BaseTest{

	public static HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void postData() {
		map.put("name", "Batman4");
		logger.info("Added name");
		map.put("email", "batman1234@gmail.com");
		logger.info("Added email");
		map.put("gender", "male");
		logger.info("Added gender");
		map.put("status", "active");
		logger.info("Added status");
		
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "/public/v2/users";
		logger.info("PayLoad created");
			}
	@Test
	
	public void createResource() {
		RestAssured
			.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer 8b526abd2d216c80af7641571d389cd04b062cecce2a8fabb435a0ddf63ae674")
			.when()
				.post()
			.then()
				.statusCode(201)
				.log().all();
		logger.info("Resource Created");
	}
}
