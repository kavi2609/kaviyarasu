package testng_wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class imple1 {
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//create an object for chromedriver class
		 ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com");
		
		c.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		c.navigate().refresh();
		System.out.println(c.getCurrentUrl());//7
		System.out.println(c.getTitle());
		c.findElementByLinkText("Gmail").click();
		c.navigate().back();
		c.findElementByLinkText("Images").click();
		c.navigate().forward();
		c.quit();
		
	}
	

}
