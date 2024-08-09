package Seleniumpack;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Foreachloop {
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
		 for (WebElement link : list) 
		 	{
	           String href = link.getAttribute("href");//link containing href attributes 
	           if (href != null) 
	           {
	                System.out.println(href);
	           }
		System.out.println(link.getText());
		 	}
	}
	
}