package Amazon_Maven_Project.Amazon_POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.DataFetching;

public class Amz_SignIn extends DataFetching
{
	WebDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement Name_TxtField;
	
	@FindBy(id="ap_phone_number")
	WebElement Mobile_TxtField;
	
	@FindBy(id="ap_password")
	WebElement Password_TxtField;
	
	@FindBy(id="continue")
	WebElement Verify_Mobile_Button; 
	
	@FindBy(id="ap_email")
	WebElement email_mob_txtfield;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continue_btn;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement Create_Amz_Accnt_Btn;
	
	@FindBy(id="signInSubmit")
	WebElement Password_txtield;
	
	public void SignIn() throws EncryptedDocumentException, IOException
	{
		/*FileInputStream s = new FileInputStream("C:\\Eclipse\\Amazon_POM\\Exel\\Credentials.xlsx");
		Workbook w = WorkbookFactory.create(s);
		String uname = NumberToTextConverter.toText(w.getSheet("Usernames").getRow(1).getCell(0).getNumericCellValue());
		//String pwd = w.getSheet("Password").getRow(1).getCell(0);
		String pwd = w.getSheet("Password").getRow(1).getCell(0).getStringCellValue(); */
		
		email_mob_txtfield.sendKeys(uname);
		continue_btn.click();
		Password_TxtField.sendKeys(pwd);
		Password_txtield.click();
		
		Reporter.log("Entering Valid Username and Password");
		
	}
	
	public void invalid_SignIn() throws EncryptedDocumentException, IOException
	{
	
		
		email_mob_txtfield.sendKeys(uname);
		continue_btn.click();
		Password_TxtField.sendKeys(pwd);
		Password_txtield.click();
		
		Reporter.log("Entering InValid Username or Password");
		
	}
	
	
	
	public void Create_Amz_Account()
	{
		Create_Amz_Accnt_Btn.click();
		Reporter.log("Clicking Create Amazon Account button");
		
	}
	
	public Amz_SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
