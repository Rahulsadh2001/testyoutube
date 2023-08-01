import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;

import io.appium.java_client.AppiumDriver;

public class First {

	  static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
    //  WebDriver driver;
    
     try { openCalculator();}
     catch(Exception exp) {
    	 
    System.out.println(exp.getCause());
    	System.out.println( exp.getMessage());
    	 exp.printStackTrace();
    	 }
     }
		
     public static void openCalculator() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "CPH2381");
		cap.setCapability("udid", "19f1df23");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("appPackage", "com.oneplus.calculator2.1.74");
		cap.setCapability("appActivity", "com.oneplus.calculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,cap);
		System.out.println("application started");
     	
	}


		
	}


