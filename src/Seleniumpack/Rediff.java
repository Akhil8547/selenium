package Seleniumpack;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
				
	}
	@Test
	public void test()
	{
		WebElement button=driver.findElement(By.xpath("//td[@valign=\"bottom\"]/input[2]"));
		String actual=button.getAttribute("check availability");
		String Expected="check availability";
		if(Expected.equals(actual))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");	
		}
	}
	@After
	public void end()
	{
		//driver.quit();
	}

}
