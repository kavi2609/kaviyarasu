package date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class d1 {

	@Test(groups="two")
	public void main(){
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		
		//create an object for chromedriver class
				ChromeDriver c= new ChromeDriver();
				c.get("https://jqueryui.com/datepicker/");
				c.switchTo().frame(0);
				c.findElementById("datepicker").click();
				
				for(int i=0;i<3;i++)
				{
					c.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
				}
				
				c.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(3) > a").click();

	}

}
