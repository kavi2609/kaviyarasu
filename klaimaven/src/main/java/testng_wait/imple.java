package testng_wait;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
public class imple {
	
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//create an object for chromedriver class
		 ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com");
		c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		c.navigate().refresh();//10
		System.out.println(c.getTitle());//10
		System.out.println(c.getCurrentUrl());//10
		c.findElementByLinkText("Images").click();//10
		c.quit();//10
	}

}
