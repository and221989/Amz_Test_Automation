package Amazon_Maven_Project.Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Amz_YourAccount 
{
	WebDriver driver;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement Hover_SignIn;
	
	@FindBy(xpath="//span[.='Your Account']")
	WebElement Your_Account;
	
	@FindBy(xpath="//span[.='Edit login, name, and mobile number']")
	WebElement Click_Login_Security;
	
	@FindBy(xpath="(//a[.='Edit'])[1]")
	WebElement Edit_Name;
	
	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElement Update_Name_TxtField;
	
	@FindBy(xpath="//input[@id='cnep_1C_submit_button']")
	WebElement Save_Changes_Btn;
	
	public void Click_YourAccount()
	{
		Actions a = new Actions(driver);
		a.moveToElement(Hover_SignIn).perform();
		Your_Account.click();
		Reporter.log("Clicking Your Account Option");
	}
	
	public void Edit_Profile(String update_name)
	{
		Click_Login_Security.click();
		Edit_Name.click();
		Update_Name_TxtField.clear();
		Update_Name_TxtField.sendKeys(update_name);
		Reporter.log("Clicking Edit Profile Option");
	}
	
	public Amz_YourAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
