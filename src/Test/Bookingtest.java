package Test;

import org.testng.annotations.Test;

import page.Bookingpage;

public class Bookingtest extends Baseclassbooking 
{
	@Test
	public void test1() throws InterruptedException
	{
	Bookingpage BP=new Bookingpage(driver);
	BP.alert();
	BP.selsource("ahmedabad");
	BP.seldestination("bangalore");
	BP.datepicker();
	BP.search();
	}
}






