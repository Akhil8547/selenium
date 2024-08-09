package TestNGpack;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groupby {
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("*");
	}
	@Test(groups = "smoke")
	public void test1()
	{
		System.out.println("smoke1");
	}
	@Test(groups = "smoke")
	public void test2()
	{
		System.out.println("smoke2");
	}
	@Test(groups = "smoke")
	public void test3()
	{
		System.out.println("smoke3");
	}
	@Test(groups = "sanity")
	public void test4()
	{
		System.out.println("rahul");
	}
	@Test(groups = "sanity")
	public void test5()
	{
		System.out.println("feeling very well");
	}

}
