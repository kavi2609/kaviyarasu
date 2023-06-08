package log4j;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class log {
	
	
	
     static Logger log = LogManager.getLogger(log.class);
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("https://facebook.com");
		
		log.info("visited website");
		log.info("click login button");
		List<WebElement> ele = ob.findElementsByName("login");
		log.warn("home page error message");
		
		for(WebElement x:ele)
		{
			if(x.isDisplayed())
			{
				x.click();
			}
		}
		Thread.sleep(3000);
	     log.info("closing web site");
	     ob.quit();
       
	}

}
