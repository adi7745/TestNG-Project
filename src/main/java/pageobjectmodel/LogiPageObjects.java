package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogiPageObjects {

	public WebDriver driver;
	
	private By username= By.xpath("//input[@id='username']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By login=By.xpath("//input[@id='Login']");
	
	private By TryForFree=By.xpath("//a[@id='signup_link']");
	
	
	
	public LogiPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public WebElement enterUsername()	{
		
		
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()	{
		
		return driver.findElement(password);
	}
	
	public WebElement ClickOnLogin() {
		
		return driver.findElement(login); 
	}
	
	public WebElement ClickOnTryForFree()	{
	
		return driver.findElement(TryForFree);
	
	}

	
}