package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cashonpickpageone {
WebDriver driver;
	
	
	By checkbox=By.xpath("//*[@id=\"adv\"]");
	By range1=By.xpath("//*[@id=\"pf\"]");
	By rang2=By.xpath("//*[@id=\"pt\"]");
	By searchbutton=By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/div[2]/div[1]/form/div[2]/input");

	public Cashonpickpageone(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void advsearch(String pricerange1, String pricerange2)
	{
		
		driver.findElement(checkbox).click();
		driver.findElement(range1).sendKeys(pricerange1);
		driver.findElement(rang2).sendKeys(pricerange2);
		driver.findElement(searchbutton).click();
	}
	
}
