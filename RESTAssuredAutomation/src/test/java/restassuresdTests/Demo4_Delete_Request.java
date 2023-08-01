package restassuresdTests;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.core.IsEqual.*;

import java.util.HashMap;
public class Demo4_Delete_Request {
	public static HashMap map=new HashMap();

	@BeforeTest

	public void putData() {
	/*	String empName=RestUtils.empName();
		String empsal=RestUtils.empsal();
		String empAge=RestUtils.empAge();
		int emp_id=11244;

		map.put("FirstName", empName);
		map.put("empsalary", empsal);
		map.put("emplAge", empAge);
*/
		int emp_id=11244;
		RestAssured.baseURI="https://demoqa.com/api/v1";
		RestAssured.basePath="/delete"+emp_id;}

	@Test

	public void testput() {
		given()
		.when()
		.delete()
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.log().all();

	}
}
