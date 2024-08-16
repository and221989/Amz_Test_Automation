package Amazon_Maven_Project.Amazon_POM;

import java.io.File;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class Test_Listeners implements ITestListener
{	
	static WebDriver driver;
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		Reporter.log("Test Cases Strated");
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\onTestStart\\"+result.getName()+Math.random()+".png");
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

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		

	     TakesScreenshot  ts = (TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\Pass\\"+result.getName()+Math.random()+".png");
			try 
			{
				FileUtils.copyFile(source, destination);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    Reporter.log("Test has Passed");
			
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		// TODO Auto-generated method stub
	
		ITestListener.super.onTestFailure(result);
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\Failed\\"+result.getName()+Math.random()+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("Test has Failed");
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test Cases Skipped");
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\onTestSkipped\\"+result.getName()+Math.random()+".png");
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

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\onTestFailedButWithinSuccessPercentage\\"+result.getName()+Math.random()+".png");
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

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\onTestFailedWithTimeout\\"+result.getName()+Math.random()+".png");
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

	//@BeforeMethod
	@Override
	public void onStart(ITestContext context)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		Reporter.log("Test Suite Started");
		/*
		TakesScreenshot  ts = (TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\onStart\\"+context.getName()+Math.random()+".png");
			try 
			{
				FileUtils.copyFile(source, destination);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		*/
	}

	@Override
	public void onFinish(ITestContext context)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("Test Suite Finished");
		
		/* TakesScreenshot  ts = (TakesScreenshot) driver;
	    File source= ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Eclipse\\Amazon_POM\\Screenshots\\onFinish\\"+context.getName()+Math.random()+".png");
			try 
			{
				FileUtils.copyFile(source, destination);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
	}
	
}
