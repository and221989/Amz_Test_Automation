package Amazon_Maven_Project.Amazon_POM;
//this is Amazon homepage java file
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Amz_HomePage 
{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Search_TextField;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement Hover_SignIn;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement text;
	
	
	public void signIn()
	{
		Hover_SignIn.click();
		Reporter.log("Clicked on SignIn button");
	}
	
	public void signOut()
	{
		signout.click();
		Reporter.log("Successfully Loged Out");
	}
	
	public void Search(String EnterText)
	{
		Search_TextField.sendKeys(EnterText + Keys.ENTER);
		Reporter.log("Searching for a Product");
	}
	public void close_one(WebDriver driver)
	{
		driver.close();
	}
	public void quit_all(WebDriver driver)
	{
		driver.quit();
	}
	public void text_1()
	{
		String t =text.getText();
	}
	public Amz_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
