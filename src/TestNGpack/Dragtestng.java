package TestNGpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Dragtestng {
	ChromeDriver driver;
	@BeforeTest
	public void beforetest()
	{
	driver=new ChromeDriver();
	
	}
	@BeforeMethod
	public void beforemethod()
	{
	driver.get("https://demoqa.com/droppable/");	
	}
	@Test
	public void test1() throws InterruptedException
	{
		WebElement dragme =driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drophere=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		driver.manage().window().maximize();
	Thread.sleep(2000);
	
		act.dragAndDrop(dragme, drophere);
		WebElement droppedtext =driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		String actual="Drop here";
		String exp="Dropped!";
		if(actual.equals(exp))
		{
		System.out.println("passed");	
		}
		else
		{
			System.out.println("failed");
		}
		act.perform();
		
				
	}
}
//	@AfterTest
//	Public void quit()
//	{
//		driver.close();
//	}
//
//
//}
