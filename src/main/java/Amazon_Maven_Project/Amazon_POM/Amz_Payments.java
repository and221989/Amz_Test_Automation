package Amazon_Maven_Project.Amazon_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_Payments 
{
	WebDriver driver; 
	
	@FindBy(xpath="//input[@data-testid='Address_selectShipToThisAddress']")
	WebElement use_this_addr_btn;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement credit_debit_radiobtn;
	
	@FindBy(xpath="(//a[.='Enter card details'])[1]")
	WebElement enter_card_details;
	
	@FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	WebElement iframe;
	
	@FindBy(xpath="//input[@id='pp-7aPttH-141']")
	WebElement COD;
	
	@FindBy(xpath="//input[@id='pp-7aPttH-128']")
	WebElement EMI;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement UPI;
	
	@FindBy(xpath="//input[@placeholder='Enter UPI ID']")
	WebElement Enter_UPI;
	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:ValidateUpiIdEvent']")
	WebElement Verity_btn;
	
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement Net_Banking;
	
	@FindBy(xpath="//select[@name='ppw-bankSelection_dropdown']")
	WebElement Select_bank;
	
	@FindBy(xpath="(//span[.='Use this payment method'])[1]")
	WebElement Use_Payment_method;
	
	@FindBy(xpath="//a[.='Axis Bank']")
	WebElement Axis_Bank;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement card_number;
	

	
	@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement enter_cart_btn;
	
	@FindBy(xpath="//span[@class='a-dropdown-container']//select[@name='ppw-expirationDate_month']")
	WebElement exp_date;
	
	@FindBy(xpath="//span[@class='a-dropdown-container']//select[@name='ppw-expirationDate_year']")
	WebElement exp_year;
	@FindBy(xpath="//button[.='Cancel']")
	WebElement cancel;
	
	@FindBy(xpath="//input[@placeholder='Enter Code']")
	WebElement enter_code;
	
	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")
	WebElement apply_btn;
	
	public void apply_Coupn() throws InterruptedException
	{
		Reporter.log("Applied Coupon code");
		enter_code.sendKeys("Amazon420");
		Thread.sleep(3000);
		apply_btn.click();
	}
	
	public void credt_debit_card(WebDriver driver) throws InterruptedException 
	{
		boolean b =credit_debit_radiobtn.isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
		
		Reporter.log("We are selecting a Credit card ");
		
		Reporter.log("Selected Credit/Debit card option");
		Thread.sleep(3000);
		//use_this_addr_btn.click();
		Thread.sleep(3000);
		credit_debit_radiobtn.click();
		Thread.sleep(3000);
		enter_card_details.click();
		Thread.sleep(3000);
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		card_number.sendKeys("2534346787320958");
		Thread.sleep(3000);
		Select date = new Select(exp_date);
		date.selectByIndex(6);
		Thread.sleep(3000);
		Select year = new Select(exp_year);
		year.selectByIndex(6);
		Thread.sleep(3000);
		enter_cart_btn.click();
		
		cancel.click();
		Thread.sleep(3000);
		
	}
	
	
	public void upi_Option() throws InterruptedException
	{
		Reporter.log("Selected UPI Option");
		UPI.click();
		Thread.sleep(2000);
		Enter_UPI.sendKeys("991122@ybl");
		Verity_btn.click();
		
	}
	
	public void netbanking_option() throws InterruptedException
	{
		Reporter.log("Selected Netbanking option");
		Thread.sleep(3000);
		Net_Banking.click();
		
		Select s = new Select(Select_bank);
		s.selectByIndex(2);
		//Select_bank.click();
		Axis_Bank.click();
		Thread.sleep(7000);
	
		
	}
	
	public void select_Payment_mode() throws InterruptedException
	{
		
		Reporter.log("Clicking on Use this Payent Method");
		Thread.sleep(3000);
		Use_Payment_method.click();
	}
	
	public void Use_Address() throws InterruptedException
	{
		boolean b =use_this_addr_btn.isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
		boolean b1=use_this_addr_btn.isEnabled();
		System.out.println(b1);
	    Assert.assertTrue(b1);
	    use_this_addr_btn.click();
	    Thread.sleep(5000);
	    Reporter.log("We are adding default Address");
		
	}
	
	
	public Amz_Payments(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
