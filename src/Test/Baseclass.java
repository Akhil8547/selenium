package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
