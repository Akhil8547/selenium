package page;
//repository create
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {
	WebDriver driver;
	By email=By.id("email");
	By password=By.id("pass");
	By loginbutton=By.id("loginbutton");
	By create=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	public Createpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void create1()
	{
	driver.findElement(create).click();
	}
	public void login1(String emaill,String passwd)
	{
		driver.findElement(email).sendKeys(emaill);
		driver.findElement(password).sendKeys(passwd);
		
	}
	public void click1()
	{
		driver.findElement(loginbutton).click();
	}

}
