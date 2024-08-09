package page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Automationdemopage {
	WebDriver  driver;
	By Fullname= By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
	By Lastname=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
	By Address=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea");
	By Email=By.xpath("//*[@id=\"eid\"]/input");
	By Phonenumber=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
	By Male=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
	By Female=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input");
	By Cricket=By.xpath("//*[@id=\"checkbox1\"]");
	By Movie=By.xpath("//*[@id=\"checkbox2\"]");
	By Hockey=By.xpath("//*[@id=\"checkbox3\"]");
	By Languages=By.xpath("//*[@id=\"msdd\"]");
	By Skills=By.xpath("//*[@id=\"Skills\"]");
	By Country=By.xpath("//*[@id=\"countries\"]");
	By selectcountry=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span");
	By year=By.xpath("//*[@id=\"yearbox\"]");
	By month=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
	By day=By.xpath("//*[@id=\"daybox\"]");
	By password=By.xpath("//*[@id=\"firstpassword\"]");
	By confirmpassword=By.xpath("//*[@id=\"secondpassword\"]");
	By submit=By.xpath("//*[@id=\"submitbtn\"]");
	By refresh=By.xpath("//*[@id=\"Button1\"]");
	By Choosefile=By.xpath("//*[@id=\"imagesrc\"]");
	public Automationdemopage (WebDriver driver)
	{
		this.driver=driver;
		driver.manage().window().maximize();
		
	}
	
	
	@BeforeTest
	public void details(String Fullname1,String Lastname1,String Address1,String Email1,String Phonenumber1,String password1,String Cpasswd1) throws InterruptedException, AWTException
	{
		driver.findElement(Fullname).sendKeys(Fullname1);
		driver.findElement(Lastname).sendKeys(Lastname1);
		driver.findElement(Address).sendKeys(Address1);
		driver.findElement(Email).sendKeys(Email1);	
//		String filepath="\"D:\\Software Testing\\Assignments\\FAB INDIA.xlsx\"";
//		fileupload(filepath);
//		driver.findElement(By.id("imagesrc")).click();
//	
		driver.findElement(Phonenumber).sendKeys(Phonenumber1);
		driver.findElement(password).sendKeys(password1);
		driver.findElement(confirmpassword).sendKeys(Cpasswd1);
		
	
	}
	public void gender()
	{
		
		WebElement male = driver.findElement(Male);
		if (!male.isSelected()) {
			male.click();
		}
		Assert.assertTrue(male.isSelected(), "Male checkbox is not selected.");
		WebElement female = driver.findElement(Female);
		if (!female.isSelected()) {
			female.click();
		}
		Assert.assertTrue(female.isSelected(), "Male checkbox is not selected.");

	
	}
	public void hobbies()
		{
		driver.findElement(Cricket).click();
//		driver.findElement(Movie).click();
//		driver.findElement(Hockey).click();

		}
	public void languages()
	{
		driver.findElement(Languages).click();
		WebElement language1=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a"));
		WebElement language2=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a"));
		language1.click();
		language2.click();			
	}
	public void Skills()
	{   
		WebElement Skill=driver.findElement(Skills);
		Select Skills=new Select(Skill);
		Skills.selectByValue("Adobe Photoshop");
	}
	public void country() throws InterruptedException
	{
		WebElement countrydrop = driver.findElement(selectcountry);
		countrydrop.click();
		By searchInput = By.xpath("/html/body/span/span/span[1]/input");
		WebElement searchField = driver.findElement(searchInput);
		searchField.sendKeys("Australia");
		Thread.sleep(2000);
		By searchresult = By.xpath("//*[@id=\"select2-country-results\"]/li[1]");

		WebElement option = driver.findElement(searchresult);
		option.click();

	}
	
	public void fileupload(String filepath) throws InterruptedException, AWTException
	{
		
		WebElement upload= driver.findElement(Choosefile);
			Actions act=new Actions(driver);
			act.click(upload);
			act.perform();
			fileupload("\"D:\\Software Testing\\Assignments\\FAB INDIA.xlsx\"");
			StringSelection stringselect=new StringSelection(filepath);
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
			
			}
	public void submit()
	{
		driver.findElement(submit).click();
	}

	
	public void refresh() {
		driver.findElement(refresh).click();
	}


	public void selectdob() {
		WebElement days = driver.findElement(day);
		Select dayelement = new Select(days);
		dayelement.selectByValue("5");
		;

		WebElement months = driver.findElement(month);
		Select monthelement = new Select(months);
		monthelement.selectByVisibleText("March");

		WebElement years = driver.findElement(year);
		Select yearelement = new Select(years);
		yearelement.selectByValue("1946");
		Assert.assertEquals(dayelement.getFirstSelectedOption().getAttribute("value"), "5",
				"Selected day is incorrect.");
		Assert.assertEquals(monthelement.getFirstSelectedOption().getText(), "March", "Selected month is incorrect.");
		Assert.assertEquals(yearelement.getFirstSelectedOption().getAttribute("value"), "1946",
				"Selected year is incorrect.");		
	}


}
