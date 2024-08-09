package Seleniumpack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	@Test
	public void testing()
	{
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
		driver.findElement(By.xpath("//input[@type=\'text']")).sendKeys("iphone");
		driver.findElement(By.xpath("//div[@id=\"nav-cart-count-container\"]")).click();
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.name("email")).sendKeys("Abc@8547",Keys.ENTER);
		
		driver.navigate().back();
		driver.navigate().back();

		driver.findElement(By.xpath("//div[@class='nav-left']/a[1]")).click();
		
	}
	@After
	public void After()
	{
	//driver.quit();
	}
}
