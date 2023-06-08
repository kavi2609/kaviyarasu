package log4j;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class l2 {
	
	
	static Logger log = LogManager.getLogger(l2.class);
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("https://facebook.com");
		log.info("visited website");
		log.info("going to click login button");
		List<WebElement> d = ob.findElementsByName("login");
		log.error("login button error message display");
		
		for(WebElement x: d)
		{
			if(x.isDisplayed())
			{
				x.click();
			}
			
		}
		Thread.sleep(3000);
		log.info("closing");
		ob.quit();
	}

}
