package Seleniumpack;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("file:///D:/pop.html");
	
}
@Test
public void testing() throws IOException	
{
	//File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileHandler.copy(src, new File("C:\\Users\\Akhil\\Pictures\\Screenshots\\selenium//shot1.png"));
	WebElement screen =driver.findElement(By.xpath("//input[@type=\\\"submit\\\"]"));
	File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("C:\\Users\\Akhil\\Pictures\\Screenshots\\selenium//shot2.png"));

	
}

}
