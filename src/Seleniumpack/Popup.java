package Seleniumpack;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
		ChromeDriver driver;
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("file:///D:/pop.html");
			
					
		}
		@Test
		public void testing()
		{
			driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
			Alert A=driver.switchTo().alert();
			A.accept();
			

			driver.findElement(By.xpath("//input[@name=\"Akhil\"]")).sendKeys("akhil");
			driver.findElement(By.xpath("//input[@name=\"c\"]")).sendKeys("c");
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
		}
		WebElement alert=driver.findElement(By.xpath("/html/body/center/input[1]"));
		String actual=alert.getAttribute("value");
		System.out.println(actual);
		String Exp ="Disply alert box";
		if(actual.equals(Exp))
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");	
		}


}
