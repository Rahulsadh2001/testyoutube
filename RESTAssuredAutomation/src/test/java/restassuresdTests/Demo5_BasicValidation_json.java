package restassuresdTests;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.CoreMatchers.hasItems;

import static org.hamcrest.core.IsEqual.*;
public class Demo5_BasicValidation_json {


	@Test(priority=0)

	public void testStatusCode() {


		when()
		.get("https://reqres.in/api/users/2")
		.then().statusCode(200)
		.log().all()
		;
	}
	@Test(priority=1)

	public void testlogin() {


		given()
		.when()
		.get("https://reqres.in/api/unknown")
		.then()
		.statusCode(200)
		.log().all();
	}
	//	//Verifying single contents
	@Test(priority=3)

	public void testsinglecontent() {


		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.body("data.email",  equalTo("janet.weaver@reqres.in"))
		.log().all();
	}
	
	//Verifying multiple contents
	@Test(priority=4)

	public void multiplenames() {


		given()
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(200)
		.body("data.first_name", hasItems("Michael","Lindsay","Tobias"))
		.log().all();
	}
	
	//Verifying parameter and headers
		@Test(priority=5)

		public void verifyingparameterandheaders() {


			given()
			.param("page", "2")
			.header("Content-Type","application/json")
			.when()
			.get("https://reqres.in/api/users?page=2")
			.then()
			.statusCode(200)
		
			.log().all();
		}


}
