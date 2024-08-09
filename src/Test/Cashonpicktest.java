package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Cashonpickpage;

public class Cashonpicktest extends Baseclasscashonpick {
	@Test
	public void test()
	{
		Cashonpickpage CP= new Cashonpickpage(driver);
		CP.searchbar("samsung");
		CP.sort();
		CP.display();
		CP.click();
	}

}
