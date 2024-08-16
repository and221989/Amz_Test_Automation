package Amazon_Maven_Project.Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Amz_Search_Filter_Product 
{
	WebDriver driver;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[1]")
	WebElement Top1_Brand_Checkbox;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")
	WebElement Top2_Brand_Checkbox;
	
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[3]")
	WebElement Top3_Brand_Checkbox;
	
	@FindBy(id="low-price")
	WebElement Min_TextField;

	@FindBy(id="high-price")
	WebElement Max_TextField;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement Go_btn;
	
	public void Brand() throws InterruptedException
	{
		Reporter.log("Selected Top Three Brands");
		Top1_Brand_Checkbox.click();
		Thread.sleep(2000);
		Top2_Brand_Checkbox.click();
		Thread.sleep(2000);
		Top3_Brand_Checkbox.click();
		Thread.sleep(2000);
		
	}
	
	public void Price_Range(String min, String max)
	{
		Reporter.log("Entering Minimum and Maximum Price Range");
		Min_TextField.sendKeys(min);
		Max_TextField.sendKeys(max);
		Go_btn.click();
		
	}
	
	public Amz_Search_Filter_Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
