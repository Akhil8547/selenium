package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actionprogram {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
	driver=new ChromeDriver();
	
	}
	@BeforeMethod
	public void beforemethod()
	{
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	
	}
	@Test
	public void test1()
	{
		WebElement Fullname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		Fullname.sendKeys("Akhil");
		WebElement rediff=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		Actions act=new Actions(driver);
		act.keyDown(Fullname, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(Fullname, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rediff, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();	
				
	}

}
