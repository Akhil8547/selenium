package Seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumclass {

	public static void main(String[] args) {
EdgeDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com/login/");
driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Abc@gmail.com");
driver.findElement(By.name("login")).click(); 
//for get title code
String actual=driver.getTitle();
System.out.println(actual);
String Expected="Log in to Facebook";
if(Expected.equals(actual))
{
	System.out.println("passed");
}
else
{
	System.out.println("failed");
}

	}

}
