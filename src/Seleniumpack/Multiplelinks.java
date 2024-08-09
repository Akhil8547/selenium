package Seleniumpack;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplelinks {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
				
	}
	@Test
	public void testing()
	{
		List <WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println("list of links"+list.size());
		
	}
	@After
	public void end()
	{
		driver.quit();
	}
	

}
