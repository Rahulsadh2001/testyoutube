package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParalledtestingDemo {
public WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException {
		 System.out.println("The thread ID for Chrome is for test1 "+ Thread.currentThread().getId());
	}
		
	@Test
public void test2() throws InterruptedException {
		System.out.println("The thread ID for Chrome is for test2 "+Thread.currentThread().getId());
		
	}
	
}
