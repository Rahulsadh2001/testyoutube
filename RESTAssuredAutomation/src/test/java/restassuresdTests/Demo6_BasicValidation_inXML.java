package restassuresdTests;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.containsString;

import static org.hamcrest.core.IsEqual.*;
public class Demo6_BasicValidation_inXML {

//verifying single content in xml
	@Test(priority=0)

	public void testSingleContent() {

        given().
		when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15")
		.then().statusCode(200)
		.body("CUSTOMER.ID", equalTo("15"))
		.log().all()
		;
	}
	
	//verifying multiple  content in xml
		@Test(priority=1)

		public void testmultipleContent() {

	        given().
			when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15")
			.then().statusCode(200)
			.body("CUSTOMER.ID", equalTo("15"))
			.body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
			.body("CUSTOMER.LASTNAME", equalTo("Clancy"))
			.log().all()
			
			;
		}

		//verifying multiple  content in one go xml using text() xpath
			@Test(priority=2)

			public void testmultipleContentinonego() {

		        given().
				when()
				.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15")
				.then().statusCode(200)
				.body("CUSTOMER.text()", equalTo("15BillClancy319 Upland Pl.Seattle"))
				
				.log().all()
				
				;
			}
			
			//find the value using xml path in xml response
			

		
		
		
	

}
