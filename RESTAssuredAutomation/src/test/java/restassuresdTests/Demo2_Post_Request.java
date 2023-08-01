package restassuresdTests;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.core.IsEqual.*;

import java.util.HashMap;
public class Demo2_Post_Request {
	public static HashMap map=new HashMap();

	@BeforeTest

	public void postData() {
		String empName=RestUtils.empName();
		  String empsal=RestUtils.empsal();
		  String empAge=RestUtils.empAge();
		  int emp_id=11244;
		  
				map.put("FirstName", empName);
				map.put("trips", empsal);
				map.put("airline", empAge);

		RestAssured.baseURI="https://api.instantwebtools.net";
		RestAssured.basePath="/v1/passenger";}

	@Test

	public void testPost() {
		given()
		.contentType("application/json")
		.body(map)
		.when()
		.post()
		.then()
		.statusCode(201)
		.and()
		.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
		.body("Message",equalTo("Operation completed successfully"));
	}
}
