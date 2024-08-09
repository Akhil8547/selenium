package Seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
String actual=driver.getTitle();
System.out.println(actual);
String Expected="LinkedIn";
if(actual.contains(Expected))
{
	System.out.println("passed");
}
else
{
	System.out.println("failed");
}

	}

}
