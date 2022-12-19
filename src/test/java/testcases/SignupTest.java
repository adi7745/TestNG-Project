package testcases;



import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;
import pageobjectmodel.LogiPageObjects;
import pageobjectmodel.SignupPage;

public class SignupTest extends BaseClass {
	
	@Test	
	public void verifySignup() throws IOException	{
		
		
		LogiPageObjects LPO=new LogiPageObjects(driver);
		
		LPO.ClickOnTryForFree().click();
		
		SignupPage SP=new SignupPage(driver);
		
		SP.enterFirstname().sendKeys("Constants.firstname");
		
		SP.enterLastName().sendKeys("Constants.lastname");
		
		SP.enterUserTitle().sendKeys("Constants.usertitle");
		
		SP.enterUserEmail().sendKeys("Constants.useremail");
		
		SP.enterUserPhone().sendKeys("Constants.userphone");
		
		SP.enterCompanyName().sendKeys("Constants.companyname");
		
		Select s = new Select(SP.CompanyEmployees());
		s.selectByIndex(4);
		
		Select s1=new Select(SP.CompanyCountry());
		s1.selectByIndex(4);
		
		Select s2=new Select(SP.CompanyLanguage());
		s2.selectByIndex(3);
	}
	
	
	

}
