package BrokenLink;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {
	public static WebDriver driver;
	//static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("Webdriver.chorme.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	//	driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	driver.get("https://officials.eci.gov.in");
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='User id']")).sendKeys("EROS12A160");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ANSHU@123");
	
	Thread.sleep(20000);
	driver.findElement(By.xpath("//a[normalize-space()='Form Processing']")).click();
	
	Thread.sleep(50000);
	driver.findElement(By.xpath("//a[normalize-space()='ERO order Accept/reject']")).click();
	
	Thread.sleep(2000);
	WebElement formtype =driver.findElement(By.xpath("//select[@name='formtype']"));
	Select ft = new Select(formtype);
	ft.selectByVisibleText("Form 8");
	
	Thread.sleep(2000);
	WebElement requesttype =driver.findElement(By.xpath("//select[@name='requesttype']"));
	Select rt = new Select(requesttype);
	rt.selectByVisibleText("Correction of Entries");
	
	Thread.sleep(2000);
	WebElement fms =driver.findElement(By.xpath("//select[@name='formstatusvalue']"));
	Select se = new Select(fms);
	se.selectByVisibleText("Directly forwarded to ERO");
	
	Thread.sleep(2000);
	WebElement p =driver.findElement(By.xpath("//select[@name='formstatusvalue']"));
	Select pt = new Select(p);
	pt.selectByVisibleText("261 (KURAWAR)");
	
	WebElement button  =driver.findElement(By.xpath("//button[@class='btn library-btn btn-common btn-blue']"));
	button.click();
	Thread.sleep(5000);
	
	
	//Thread.sleep(2000);
	WebElement re =driver.findElement(By.xpath("//select[@class='search-bar search-bar2']"));
	Select tt = new Select(re);
	tt.selectByVisibleText("Show all records");
	Thread.sleep(5000);
	
	List<WebElement> records  =driver.findElements(By.xpath("//*[text()='Directly forwarded to ERO']"));
	 for (WebElement element : records) {
		 
		 element.click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[4]//span[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Accept']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='selectAll']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//textarea[@name='eroAcceptReason']")).sendKeys("Verified");
		 
		 driver.findElement(By.xpath("(//button[@type='submit'])[6]")).click();
	 }
	}

}


