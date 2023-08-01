package Lishnerclass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Customlishtener.class)
public class Screenshottest extends Base {

	
	@BeforeTest
	
	public void setup() throws InterruptedException {
		
		initialization();
	}
	
	@AfterMethod
	
	public void quit() {
		
		driver.quit();
	}
	
	@Test
	
	public void tackscreenshot() throws InterruptedException {
	
		Assert.assertEquals(false, true);
		Thread.sleep(3000);
	}
}
