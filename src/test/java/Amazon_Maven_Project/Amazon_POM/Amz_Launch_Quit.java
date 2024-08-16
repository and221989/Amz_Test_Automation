package Amazon_Maven_Project.Amazon_POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(Test_Listeners.class)
public class Amz_Launch_Quit extends Test_Listeners
{
	//public static WebDriver driver;
	
	@BeforeTest
	//@Parameters("browser")
	public void Launch()//(String browser)
	{
//		if(browser.equals("chrome"))
//				{
//					driver = new ChromeDriver();
//			
//				}
//		if(browser.equals("edge"))
//		{
//			driver = new EdgeDriver();
//	
//		}
//		if(browser.equals("firefox"))
//		{
//			driver = new FirefoxDriver();
//	
//		}
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime() - (1000 + 60 * 60 * 24 * 5));
		//System.out.println(d2.toString());
		Instant date = d2.toInstant();
		System.out.println(date);
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	     TakesScreenshot  ts = (TakesScreenshot) driver;
		    File source= ts.getScreenshotAs(OutputType.FILE);
		    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\BeforeTest\\"+date+".png");
				try 
				{
					FileUtils.copyFile(source, destination);
				} 
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
	}
	
	@AfterTest
	public void Signout() throws InterruptedException 
	{
	
	
		Amz_HomePage a = new Amz_HomePage(driver);
		Thread.sleep(3000);
		System.out.println(a.text.getText());
		Thread.sleep(3000);
		if(a.text.getText().equals("Hello, sign in"))
		{
			driver.quit();
		}
		else
		{
		Actions signout = new Actions(driver);
		signout.moveToElement(a.Hover_SignIn).perform();
		a.signOut();
		
		
	     TakesScreenshot  ts = (TakesScreenshot) driver;
		    File source= ts.getScreenshotAs(OutputType.FILE);
		    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\AfterTest\\"+Math.random()+".png");
				try 
				{
					FileUtils.copyFile(source, destination);
				} 
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Thread.sleep(5000);
				driver.manage().window().minimize();
			driver.close();
			
		}
	}
}
