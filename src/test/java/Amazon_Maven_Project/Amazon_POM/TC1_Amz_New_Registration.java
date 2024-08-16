package Amazon_Maven_Project.Amazon_POM;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Test_Listeners.class)
public class TC1_Amz_New_Registration extends Amz_Launch_Quit
{
	@Test
	@Epic("Epic001")
	@Feature("001:New_registration")
	@Story("Validate New Registration Functionality")
	@Severity(SeverityLevel.BLOCKER)
	@Description("In this test Verify New Registration functionality is working fine or not")
	public void Registration() throws InterruptedException 
	{
		Amz_HomePage main_signin = new Amz_HomePage(driver);
		main_signin.signIn();
		
		Amz_Registration Registration = new Amz_Registration(driver);
		Registration.Create_Account();
		
		Assert.assertFalse(false);
		
	

	}
	
}
