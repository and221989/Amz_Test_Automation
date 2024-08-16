package Amazon_Maven_Project.Amazon_POM;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.DataFetching;
@Listeners(Test_Listeners.class)
public class TC5_Amz_Search_Product extends Amz_Launch_Quit
{
	@Test
	public void Search_Product() throws EncryptedDocumentException, IOException
	{
		DataFetching d1 = new DataFetching();
		d1.data();
		
		Amz_HomePage main_signin = new Amz_HomePage(driver);
		main_signin.signIn();
		
		Amz_SignIn signin = new Amz_SignIn(driver);
		signin.SignIn();
		
		main_signin.Search("Shoes");
		
	}
	

}
