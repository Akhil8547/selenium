
package TestNGpack;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGdemo {
	WebDriver driver;
@BeforeTest
public void beforetest()
{
	driver=new ChromeDriver();
}



@Test(priority=5,invocationCount = 2)
public void test1()
{
	System.out.println("how");
}
@Test(priority=2)
public void test2()
{
	System.out.println("are");
}
@Test(priority=3)
public void test3()
{
	System.out.println("you");
}
@Test(priority=4)
public void test4()
{
	System.out.println("rahul");
}
@Test(priority=1)
public void test5()
{
	System.out.println("feeling very well");
}
}

