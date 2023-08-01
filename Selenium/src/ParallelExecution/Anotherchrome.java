package ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotherchrome {
	
	@BeforeTest
	public void beforeTest() {
		 System.out.println("The thread ID for Chrome is anotherchrome is for beforetest "+ Thread.currentThread().getId());
			}

        @Test
 	public void ChromeTestMethod()
 	{ 
	  //Initialize the chrome driver
	 System.out.println("The thread ID for Chrome is anotherchrome is for ChromeTestMethod "+ Thread.currentThread().getId());
	 
       }
 
       @AfterTest
       public void afterTest() {
    	   System.out.println("The thread ID for Chrome is anotherchrome is for aftertest "+ Thread.currentThread().getId());
	
	
       }
}

