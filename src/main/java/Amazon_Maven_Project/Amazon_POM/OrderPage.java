package Amazon_Maven_Project.Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {
	
WebDriver driver;
	
	@FindBy(id="Oder")
	WebElement Search_TextField;
	
	public void getOrder()
	{
		System.out.println("Oredr Page");
	}

}
