package Amazon_Maven_Project.Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_Registration 
{
	WebDriver driver;
	@FindBy(xpath="//span[@id='auth-create-account-link']")
	WebElement Create_New_Accnt;
	
	@FindBy(id="ap_customer_name")
	WebElement Name_TxtField;
	
	@FindBy(id="ap_phone_number")
	WebElement Mobile_TxtField;
	
	@FindBy(id="ap_password")
	WebElement Password_TxtField;
	
	@FindBy(id="continue")
	WebElement Verify_Mobile_Button;
	
	@FindBy(xpath="//h4[.='Mobile number already in use']")
	WebElement Register_warning;
	
	
	
	public void Create_Account() throws InterruptedException
	{
		Create_New_Accnt.click();
		Name_TxtField.sendKeys("Amol Deshmukh");
		Mobile_TxtField.sendKeys("9970398616");
		Password_TxtField.sendKeys("@1234567abc");
		Verify_Mobile_Button.click();
		
		
		Thread.sleep(7000);
		
		String act_msg = Register_warning.getText();
		String exp_msg = "Mobile number already in use";
		//Assert.assertTrue(false,msg);
		Assert.assertNotEquals(act_msg, exp_msg,"Mobile number already in use" );
		Reporter.log("Successfully created new Amazon Account");
		
	
	}
	
	Amz_Registration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
