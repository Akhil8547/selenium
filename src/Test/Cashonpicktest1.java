package Test;

import org.testng.annotations.Test;

import page.Cashonpickpage;
import page.Cashonpickpageone;

public class Cashonpicktest1 extends Baseclasscashonpick {
@Test
	public void test2()
	{
	    Cashonpickpage CP= new Cashonpickpage(driver);
		Cashonpickpageone cops=new Cashonpickpageone(driver);
		CP.searchbar("oneplus");
		cops.advsearch("1000","2000");
	}

}
