package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void beforetest(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeDriver driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edgedriver"))
		{
			EdgeDriver driver=new EdgeDriver();
		}
		else
		{
			FirefoxDriver driver=new FirefoxDriver();
		}
	}
	@Test
	public void test()
	{
		driver.get("https://www.google.com/");
	}
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click()
		;
		
	}

}
