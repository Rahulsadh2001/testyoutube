import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static void initialization() throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Webdriver\\chromedriver.exe");  	
	driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	
	public  void failed() throws IOException  {
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
		FileUtils.copyFile(screenshotFile, new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot\\test.jpg"));		}
	
	}
	
	
}
