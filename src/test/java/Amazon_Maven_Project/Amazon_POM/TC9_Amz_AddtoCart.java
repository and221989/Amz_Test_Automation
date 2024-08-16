package Amazon_Maven_Project.Amazon_POM;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utility.DataFetching;

@Listeners(Test_Listeners.class)
public class TC9_Amz_AddtoCart extends Amz_Launch_Quit
{
	@Test
	public void Click_Product() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		DataFetching d1 = new DataFetching();
		d1.data();
		
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.signIn();
		
		Amz_SignIn signin = new Amz_SignIn(driver);
		signin.SignIn();
		
		homepage.Search("Shoes");
		
		Amz_Search_Filter_Product filter_product = new Amz_Search_Filter_Product(driver);
		filter_product.Brand();
		filter_product.Price_Range("1000", "2000");
		
		Amz_Select_Product select_product = new Amz_Select_Product(driver);
		
		select_product.Click_Product(driver);
		select_product.Product_Details(driver);
		select_product.Quantity_Increase();
		select_product.Add_cart();
		
		select_product.Switch_Child_to_Parent(driver);
		
		
	}

}
