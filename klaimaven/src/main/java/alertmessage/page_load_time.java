package alertmessage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class page_load_time {

	@Test(groups="two")
	public void main() {
          System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//create an object for chromedriver class
				ChromeDriver c= new ChromeDriver();
				c.get("https://jqueryui.com/datepicker/");
				
				c.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				

	}

}
