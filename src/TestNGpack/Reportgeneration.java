package TestNGpack;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportgeneration {
	
	WebDriver driver;
	ExtentHtmlReporter extent;
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void beforetest()
	{
		extent=new ExtentHtmlReporter("./Report/myreport.html");
		extent.config().setTheme(Theme.DARK);
		extent.config().setReportName("automation report");
		extent.config().setDocumentTitle("MYREPORT");
		reports=new ExtentReports();
		reports.attachReporter(extent);
		reports.setSystemInfo("os", "windows");
		reports.setSystemInfo("host", "general");
		reports.setSystemInfo("tested by", "rahul");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void beforemethod()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test3()
	{ 
		
		String actual=driver.getTitle();
		String Expected="Facebook – log in or sign upet";
		
		Assert.assertEquals(actual, Expected);
//		if(logo.isDisplayed())
//		{
//			System.out.println("logo is present");
//		}
//		else
//		{
//			System.out.println("logo is not present");
//			
//		}
	}
	@Test
	public void test1()
	{
		test=reports.createTest("test1");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("akhil@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("12345688");
		
	}
	@Test
	public void test2()
	{
	test=reports.createTest("test2");
		driver.findElement(By.name("login")).click();
	}
	@AfterTest
	public void quit()
	{
		reports.flush();
	}

}

