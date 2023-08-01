


	import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Test {
	 
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Downloads\\geckodriver-v0.33.0-win32\\geckodriver.exe"); // Setting system properties of FirefoxDriver
					WebDriver driver = new FirefoxDriver();

		driver.get("https://ultimateqa.com/dummy-automation-websites/");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
	
		
	List<WebElement> allinks=	driver.findElements(By.tagName("a"));
	Iterator<WebElement> iterator = allinks.iterator();
	while (iterator.hasNext()) {
	String	url = iterator.next().getText();
  	  System.out.println(url);
    }
		}}

	
