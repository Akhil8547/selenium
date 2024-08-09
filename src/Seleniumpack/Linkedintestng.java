package Seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Linkedintestng {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void beforemethod()
	{
		driver.get("https://www.linkedin.com/home");
	}
	@Test
	public void test1()
	{
		String actual=driver.getTitle();
		System.out.println(actual);
		String Expected="LinkedIn";
		if(actual.contains(Expected))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}
	@Test
	public void test2()
	{
		List <WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println("list of links"+list.size());
	
	}
	@AfterMethod
	public void quit()
	{
		//driver.close();
	}
	@AfterTest
	public void aftertest()
	{
		
	}

}
