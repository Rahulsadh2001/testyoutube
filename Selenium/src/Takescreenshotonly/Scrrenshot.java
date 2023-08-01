package Takescreenshotonly;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scrrenshot {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		  WebDriverManager.chromedriver().setup();
	        // Create the driver object
	      
			driver = new ChromeDriver();
		//	Thread.sleep(3000);
			driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
		WebElement search=	driver.findElement(By.xpath("//*[@title='Search']"));
			Select s= new Select(search);
			s.selectByVisibleText("booksy");
			
			}
	}


