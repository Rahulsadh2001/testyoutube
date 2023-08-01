import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payload;
import  io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//validate if add place 
		//given- All input details,
		//when- Submit the api
		//then -validate the response
		
		//add place then update place then response verify
	RestAssured.baseURI="https://rahulshettyacademy.com/";
	String response=given().queryParam("key","qaclick123").header("Content-Type","application/json").body(payload.AddPlace())
	.when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
	.body("scope", equalTo("APP")).header("server", "apache/2.4.18.").extract().response().asString();
	System.out.println(response);
	JsonPath js=new JsonPath(response);
	String placeid=js.getString("placeid");
	System.out.println(placeid);
	
	//update
	given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").
	body("given need to update").when().
	put("/maps/api/place/add/json").then().assertThat().statusCode(200).body("msg",equalTo("address sucessfully added"));
	

}}
