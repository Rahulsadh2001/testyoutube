package SerializationDeserialzation;

import java.util.ArrayList;
import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.containsString;
public class StudentAPIwithoutSerialization {

	public HashMap map =new HashMap();
	
	@Test(priority=0)
	public void createnewStudent(){
		
		
		map.put("id", "101");
		map.put("firtname", "Kumar");
		map.put("email", "abcd@gmail.com");
		
		map.put("programme", "manager");
		
		ArrayList<String> list=new ArrayList();
		list.add("java");
		list.add("selenium");
		map.put("courses", list);
		given()
		.contentType(ContentType.JSON)
		.body(map)
		.when()
		.post("https://localhost:8085/student").
		then()
		.statusCode(201)
		.assertThat()
		.body("msg", equalTo("studentadd"));
		
		
		String input = "daabaac";
	}
	{
		
		
		
	}
	
}
