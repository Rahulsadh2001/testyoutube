package Jenkins.Project;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicproject {
	public static WebDriver driver;
	
	@Test()
	public  void luanching() throws InterruptedException {
	
	


WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
			driver.get("https://youtu.be/vxVOXK3wvNU");
			
			driver.navigate().refresh();
//			
	WebElement search=	driver.findElement(By.xpath("//button[@aria-label='Subscribe to Learn by rahul.']"
			+ "//div[@class='yt-spec-touch-feedback-shape__fill']"));
	Thread.sleep(3000);
	Actions action = new Actions(driver);
	action.sendKeys(Keys.SPACE).build().perform();
	 Thread.sleep(3000);
	 action.sendKeys("m").build().perform();
	//		search.click();
//	WebElement signin = driver.findElement(By.xpath("//a[@class='yt-spec-button-shape-next yt-spec-button-shape-next--text yt-spec-button-shape-next--call-to-action yt-spec-button-shape-next--size-m yt-spec-button-shape-next--align-by-text']"
//			+ "//div[@class='yt-spec-touch-feedback-shape__fill']"));
//	signin.click();
//	
//	Thread.sleep(3000);
driver.quit();
	}
	
}