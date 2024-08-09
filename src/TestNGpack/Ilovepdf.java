package TestNGpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ilovepdf {
	WebDriver driver;
	@BeforeTest
	public void beforemethod()
	{
	driver= new ChromeDriver();
	
	}
	@Test
	public void befortest() throws AWTException, InterruptedException
	{
		driver.get("https://www.ilovepdf.com/excel_to_pdf");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();	
		fileupload("\"D:\\Software Testing\\Assignments\\FAB INDIA.xlsx\"");
	}
	public void fileupload(String p) throws AWTException, InterruptedException
	{
	StringSelection stringselect=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselect,null);
	Thread.sleep(2000);
	Robot Rb=new Robot();
	Rb.keyPress(KeyEvent.VK_CONTROL);
	Rb.keyPress(KeyEvent.VK_V);
	
	Rb.keyRelease(KeyEvent.VK_CONTROL);
	Rb.keyRelease(KeyEvent.VK_V);
	
	Rb.keyPress(KeyEvent.VK_ENTER);
	Rb.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"processTask\"]")).click();
	
	
	
	}

}
