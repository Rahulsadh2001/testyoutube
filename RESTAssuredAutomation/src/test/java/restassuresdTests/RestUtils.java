package restassuresdTests;

import org.apache.*;
import org.apache.commons.lang.RandomStringUtils;
public class RestUtils {

	
	public static String getfirstname() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return("John"+generatedString);
	}
	
public static String getlastname() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return("sadh"+generatedString);
	}
public static String getusername() {
	
	String generatedString = RandomStringUtils.randomAlphabetic(3);
	return("John"+generatedString);
}
public static String getPassword() {
	
	String generatedString = RandomStringUtils.randomAlphabetic(3);
	return("John"+generatedString);
}
public static String getemail() {
	
	String generatedString = RandomStringUtils.randomAlphabetic(3);
	return(generatedString+"gmail.com");
}

public static String empName() {
	
	String generatedString = RandomStringUtils.randomAlphabetic(3);
	return(generatedString+"sadh");
}
public static String empsal() {
	
	String generatedString = RandomStringUtils.randomNumeric(5);
	return(generatedString);
}
public static String empAge() {
	
	String generatedString = RandomStringUtils.randomNumeric(3);
	return(generatedString);
}
}
