package alertmessage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class d1 {

	@Test(groups="one")
	public void main() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		
		//create an object for chromedriver class
				ChromeDriver c= new ChromeDriver();
				c.get("https://jqueryui.com/datepicker/");
				
				c.switchTo().frame(0);
				
				c.executeScript("alert('time out')");
				
				Thread.sleep(2000);
				Alert d3 = c.switchTo().alert();
				d3.accept();
	}

}
