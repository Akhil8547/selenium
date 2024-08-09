package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Createpage;

public class Createtest extends Baseclass {
	
	@Test
	public void test() throws InterruptedException
	{
		Createpage cr=new Createpage(driver);
		cr.create1();
		Thread.sleep(2000);
		cr.login1("akhil", "abbb");
		cr.click1();
	}
}
