package restassuresdTests;

import org.testng.annotations.Test;
 import static io.restassured.RestAssured.*;
 import static org.hamcrest.Matcher.*;
 import static org.hamcrest.core.IsEqual.*;
public class Demo1_GET_Request {

	
	@Test
	
	public void getWheatherDetails() {
		
		given()
		.when()
		.get("https://reqres.in/api/unknown")
		.then().statusCode(200).statusLine("HTTP/1.1 200 OK")
		.assertThat()
		.body("name", equalTo("aqua sky"));
	}
}
