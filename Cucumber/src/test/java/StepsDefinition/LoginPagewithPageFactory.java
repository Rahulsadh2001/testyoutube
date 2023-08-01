package StepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagewithPageFactory {

	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	WebDriver driver=null;
	public LoginPagewithPageFactory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
