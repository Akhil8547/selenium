package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Phpbooking {
WebDriver driver;
@BeforeTest
public void beforetest()
{
	driver=new ChromeDriver();
	driver.get("https://phptravels.net/hotels");
}
@Test
public void Test() throws InterruptedException
{
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div[1]/ul/li[2]/a")).click();
	driver.findElement(By.id("checkin")).click();
	String exp="December 2024";
	String date="20";
	while(true)
	{
	Thread.sleep(2000);
	
	String actual=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[2]")).getText();
	if(actual.equals(exp))
	{
		break;
	}
	else
	{	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[5]/div[1]/table/thead/tr[1]/th[3]")).click();
	}
		
	}
	driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[6]/div[1]/table/tbody/tr[4]/td[7]")).click();
}


}
