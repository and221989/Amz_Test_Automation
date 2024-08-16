package Amazon_Maven_Project.Amazon_POM;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.DataFetching;

@Listeners(Test_Listeners.class)
public class TC4_Amz_EditProfile extends Amz_Launch_Quit
{
	@Test
	public void Edit_Profile() throws EncryptedDocumentException, IOException
	{
		DataFetching d1 = new DataFetching();
		d1.data();
		
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.signIn();
		
		Amz_SignIn signin = new Amz_SignIn(driver);
		signin.SignIn();
		
		homepage.signIn();
		
		Amz_YourAccount login_security = new Amz_YourAccount(driver);
		login_security.Edit_Profile("Amol123");
		
		
	}
	

}
