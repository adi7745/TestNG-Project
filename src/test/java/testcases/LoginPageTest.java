package testcases;


import java.io.IOException;

import org.testng.annotations.Test;
import Resources.BaseClass;
import pageobjectmodel.LogiPageObjects;

public class LoginPageTest extends BaseClass{

	@Test 
	public void login() throws IOException	{
		
		
		//driver.findElements(By.xpath("//input[@id='username']")).sendkeys("test123");
		
		LogiPageObjects LPO=new LogiPageObjects(driver);
		
		LPO.enterUsername().sendKeys("Constants.username");
		
		LPO.enterPassword().sendKeys("Constants.password");
		
		LPO.ClickOnLogin().click();
		
	
	}
}
