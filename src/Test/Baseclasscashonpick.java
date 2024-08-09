package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclasscashonpick {

	WebDriver driver;
	@BeforeClass
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://cashonpick.com/");
	}
}
