package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public static void selectDropdown(WebElement dropdown,int index)	{
		
		Select s=new Select(dropdown);
		s.selectByIndex(index);
	}

	public static void handLeAssertion() {
		// TODO Auto-generated method stub
		
	}
}


