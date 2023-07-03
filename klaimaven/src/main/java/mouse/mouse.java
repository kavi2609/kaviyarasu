package mouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testnglisteners.c3.class)
public class mouse {
    @Test
	public static void main ()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver c= new ChromeDriver();
		
		c.get("https://www.facebook.com");
          WebElement ele = c.findElementByName("login");
		
		Actions d1= new Actions(c);
		
		//d1.click(ele).build().perform();
		
		//d1.doubleClick(ele).build().perform();
		
		//d1.contextClick(ele).build().perform();
		
		d1.moveToElement(ele).click().build().perform();
		
//		d1.clickAndHold(ele).build().perform();
//		Thread.sleep(3000);
//		d1.release(ele).build().perform();
		
		
		
	}

}
