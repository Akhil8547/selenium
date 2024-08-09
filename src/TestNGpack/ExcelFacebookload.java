package TestNGpack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelFacebookload {
	WebDriver driver;
	@BeforeTest
	public void beforetest()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public  void beforemethod()
	{
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void Test() throws IOException
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\Akhil\\Downloads//facebookdata.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook(ob);
		XSSFSheet sheet=Workbook.getSheet("sheet1");
		int rowcount=sheet.getLastRowNum();
			for(int i=1;i<=rowcount;i++)
			{
				String username=sheet.getRow(i).getCell(0).getStringCellValue();
				String password=sheet.getRow(i).getCell(1).getStringCellValue();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
				//System.out.println("username:"+username);
				driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
				driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
				//System.out.println("Password"+password);
				driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
				
			}
		
	}

}
