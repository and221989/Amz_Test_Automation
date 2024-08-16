package Amazon_Maven_Project.Amazon_POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Amz_Select_Product 
{
	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]")
	WebElement Select_Product;
	
	@FindBy(xpath="//h2[.='Product details']")
	WebElement Prod_details;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement Add_to_cart;
	
	@FindBy(xpath="//select[@id='quantity']")
	WebElement Increment_Quantity;
	
	@FindBy(xpath="//span[@class='a-button a-button-span11 a-button-base a-button-small']")
	WebElement Go_to_cart;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement Proceed_buy;
	
	public void Click_Product(WebDriver driver)
	{
		Select_Product.click();
		
		 Set<String> parentandchild= driver.getWindowHandles();
		 Iterator<String> pc= parentandchild.iterator();
		 String Parent=   pc.next();
		 String child=     pc.next();
		 driver.switchTo().window(child);
		 System.out.println(driver.getCurrentUrl());
		 Reporter.log("Selected Third Product");
	}
	
	public void Switch_Child_to_Parent(WebDriver driver)
	{
		driver.close();
		 Set<String> parentandchild= driver.getWindowHandles();
		 Iterator<String> pc= parentandchild.iterator();
		 String Parent=   pc.next();
		driver.switchTo().window(Parent);
		 
		 System.out.println(driver.getCurrentUrl());
		 Reporter.log("Switching from Child window to Parent window");
	}
	
	public void Product_Details(WebDriver driver) throws InterruptedException
	{
		Point p = Prod_details.getLocation();
		int x =p.getX();
		int y =p.getY();
		System.out.println(x+" "+y);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(5000);
		Reporter.log("Product details are displayed");
		Point p1 = Add_to_cart.getLocation();
		int x1 =p1.getX();
		int y1 =p1.getY();
		System.out.println(x1+" "+y1);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollTo("+x1+","+y1+")"); //scrollTo()-> Up, scrollBy()->  Down
		Thread.sleep(5000);
	}
	
	
	public void Add_cart() throws InterruptedException
	{
		Thread.sleep(3000);
		Add_to_cart.click();
		Reporter.log("Clicking on Add to Cart Button");
	}
	
	public void Quantity_Increase()
	{
		Select s = new Select(Increment_Quantity);
		s.selectByValue("3");
		Reporter.log("Increasing the quantity of existing product to Three");
	}
	
	public void GoToCart() 
	{
		Go_to_cart.click();
		Reporter.log("Clicking on Go to cart button");
	}
	
	public void Quantity_Decrease()
	{
		Select s = new Select(Increment_Quantity);
		s.selectByValue("1");
		Reporter.log("Descreasing the quantity of existing product to Two");
	}
	
	public void Proceed_to_buy() throws InterruptedException
	{
		Thread.sleep(2000);
		Proceed_buy.click();
		Reporter.log("Clicked on Proceed to Buy button");
	}
	
	
	public Amz_Select_Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
