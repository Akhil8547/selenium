package Seleniumpack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
driver=new ChromeDriver();
driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

	}
	@Test
	public void Testing()
	{
		String actual=driver.getTitle();
		System.out.println(actual);
		String Expected="LinkedIn";
		if(actual.contains(Expected))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}
		@After
			public void After()
			{
			driver.quit();
			}

	}
	

