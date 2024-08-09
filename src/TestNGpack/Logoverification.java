package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logoverification {
WebDriver driver;
@BeforeMethod
public void beforemethod()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
}
@Test
public void beforetest()
{
	WebElement logo= driver.findElement(By.xpath("//*[@id=\"logo\"]"));
	if(logo.isDisplayed())
	{
		System.out.println("logo is present");
	}
	else
	{
		System.out.println("logo is not present");
		
	}
    
}

}