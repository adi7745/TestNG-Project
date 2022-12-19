package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public void browserInitialization() throws IOException		{
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Aditya\\eclipse-workspace\\Maven\\src\\main\\java\\Resources\\data.properties");

	Properties prop=new Properties();
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome"))	{
		
	driver=new ChromeDriver();
		
		
	}else if(browserName.equalsIgnoreCase("firefox"))	{
		
	}else	{
		
		System.out.println("edge");
	}
	}	
				
	
	@BeforeMethod
	public void login() throws IOException	{
		
		browserInitialization();
		
		driver.get("https://login.salesforce.com/");
		
	
	}
}
