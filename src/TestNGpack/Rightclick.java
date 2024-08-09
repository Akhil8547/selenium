package TestNGpack;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Rightclick {
		ChromeDriver driver;
		@BeforeTest
		public void beforetest() {
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void beforemethod()
		{
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		}
		@Test
		public void test() {
			WebElement button=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
			Actions act = new Actions(driver);
			act.contextClick(button);
			act.perform();
			WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
			edit.click();
			driver.switchTo().alert();
			WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
			act.doubleClick(doubleclick);
			act.perform();
			driver.switchTo().alert();
			
			
		}


}
