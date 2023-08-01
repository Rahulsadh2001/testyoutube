import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicproject {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	

WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		//	Thread.sleep(3000);
			driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
		WebElement search=	driver.findElement(By.xpath("//*[@title='Search']"));
		search.sendKeys("booksy");
		Thread.sleep(3000);
		List<WebElement> lists=	driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul"));
		for(int i=0;i<lists.size();i++) {
			
			String s=lists.get(i).getText();
		if(s.contains("booksy books")) {
			lists.get(i).click();
			
		break;
		}System.out.println("value is find"+s);}
	Thread.sleep(5000);
	
	driver.quit();
	}
}