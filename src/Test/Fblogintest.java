package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void test()
	{
		Fbloginpage fb= new Fbloginpage(driver);
		fb.login("akhil", "abbb");
		fb.click();
	}
}
