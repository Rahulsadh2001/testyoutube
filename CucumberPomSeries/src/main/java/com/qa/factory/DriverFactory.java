package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	
	public WebDriver driver;
	
	public static  ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
	
	public void init_driver(String browser) {
		
		System.out.println("browser vallue is: "+ browser);
	if(browser.equals("chrome")) {
		
	WebDriverManager.chromedriver().setup();
	tlDriver.set(new ChromeDriver());
	
	}
	else if(browser.equals("firefox")) {
	?
			<>