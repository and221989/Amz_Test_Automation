package Amazon_Maven_Project.Amazon_POM;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TC15_Amz_GoToCart_WithoutLogin extends Amz_Launch_Quit
{
	@Test
	public void Cart_WithoutLogin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		/* Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.signIn();
		
		Amz_SignIn signin = new Amz_SignIn(driver);
		signin.SignIn(); */
		
		Amz_HomePage homepage = new Amz_HomePage(driver);
		homepage.Search("Shoes");
		
		Amz_Search_Filter_Product filter_product = new Amz_Search_Filter_Product(driver);
		filter_product.Brand();
		filter_product.Price_Range("1000", "2000");
		
		Amz_Select_Product select_product = new Amz_Select_Product(driver);
		
		select_product.Click_Product(driver);
		select_product.Product_Details(driver);
		select_product.Quantity_Increase();
		select_product.Add_cart();
		select_product.GoToCart();
		select_product.Quantity_Decrease();
		select_product.Proceed_to_buy();
		
		select_product.Switch_Child_to_Parent(driver);
		//homepage.quit_all(driver);
		
		/*Amz_Payments payment = new Amz_Payments(driver);
		payment.Use_Address();
		payment.upi_Option();
		payment.netbanking_option();
		payment.credt_debit_card();*/
	}

}
