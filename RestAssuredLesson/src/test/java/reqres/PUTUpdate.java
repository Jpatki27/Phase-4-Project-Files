package reqres;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

public class PUTUpdate {
	
		public static HashMap<String, String> map= new HashMap<String, String>();
		
		@BeforeMethod
		
		public void createPUTUpdate() {
			//map.put("name", "Jason");
			map.put("job", "QA Engineer");
			RestAssured.baseURI = "https://reqres.in";
			RestAssured.basePath = "/api/register";
		}
		
		@Test
		
		public void postData() {
			RestAssured
				.given()	
					.contentType("application/json")
					.body(map)
				.when()
					.post()
				.then()
					.statusCode(400);
			
		}

	}
