package Seleniumpack;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
}
@Test
public void testing()
{
	driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("Abc@123");
	driver.findElement(By.xpath("//*[@name=\"pass\"]")).sendKeys("123");
	driver.findElement(By.xpath("//*[@name=\"login\"]")).click();

}
}
