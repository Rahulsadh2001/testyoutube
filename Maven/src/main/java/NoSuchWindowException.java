import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class NoSuchWindowException {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		try {
			
	
			// TODO: handle exception
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      // JavaScript Executor to enter text
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      j.executeScript ("document.getElementById('search-strings').value='Selenium'");
	      driver.close();
} 
	
catch (Exception e) {
	System.out.println("exception name is  "+e.getMessage());

}
	}}


