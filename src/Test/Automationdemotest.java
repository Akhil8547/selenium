package Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import page.Automationdemopage;

public class Automationdemotest extends Baseclassautomationdemo {
	@Test
	public void test() throws InterruptedException, AWTException 
	{
		Automationdemopage AD=new Automationdemopage(driver);
		AD.details("Akhil", "c", "Address123", "Akhil@123", "9207534161","Pass123","Pass123");
		
		AD.gender();
		
		AD.hobbies();
		AD.languages();

		AD.Skills();
		AD.country();
		AD.selectdob();

		//AD.fileupload("\"C:\\Users\\Akhil\\Pictures\\Screenshots\\Screenshot 2024-07-25 121856.png\"");
		AD.submit();
		
	}

}
