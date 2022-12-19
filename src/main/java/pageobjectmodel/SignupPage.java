package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
	
	
	public WebDriver driver;
	
	
	By FirstName= By.xpath("//input[@name='UserFirstName']");		//firstname
	
	By lastName=By.xpath("//input[@name='UserLastName']");			//lastname
	
	By usertitle=By.xpath("//input[@name='UserTitle']");			//title
	
	By useremail=By.xpath("//input[@name='UserEmail']");			//email
	
	By userphone=By.xpath("//input[@name='UserPhone']");			//phone
	
	By usercompayname=By.xpath("//input[@name='CompanyName']");		//company name
	
	By selectCompanyEmployees= By.xpath("//select[@name='CompanyEmployees']");
	
	By selectCompanyCountry=By.xpath("//select[@name='CompanyCountry']");

	By selectCompanyLanguage=By.xpath("//selet[@name='CompanyLanguage']");


	private By CompanyCountry;


	private By CompanyEmployees;


	private By CompanyLanguage;


	private By CompanyName;
	
	
	public SignupPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	
		this.driver=driver2;
	}


	public WebElement enterFirstname()	{
		
		return driver.findElement(FirstName);
		
	}

	public WebElement enterLastName() {
		
		return driver.findElement(lastName);
	}
	
	public WebElement enterUserTitle() {
		
		return driver.findElement(usertitle);
	}

	public WebElement enterUserEmail() {
		
		// TODO Auto-generated method stub
		return driver.findElement(useremail);
	}

	public WebElement enterUserPhone() {
		
		// TODO Auto-generated method stub
		return driver.findElement(userphone);
	}

	public WebElement CompanyEmployees() {
		// TODO Auto-generated method stub
		return driver.findElement(CompanyEmployees);
	}


	public WebElement CompanyCountry() {
		// TODO Auto-generated method stub
		return driver.findElement(CompanyCountry);
	}


	public WebElement CompanyLanguage() {
		// TODO Auto-generated method stub
		return driver.findElement(CompanyLanguage);
	}


	public WebElement enterCompanyName() {
		// TODO Auto-generated method stub
		return driver.findElement(CompanyName);
	}
	}


	
	
		
		
	
	

