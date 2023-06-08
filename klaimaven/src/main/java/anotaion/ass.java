package anotaion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class ass {
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.facebook.com");
		
		WebElement d2 = n.findElementByName("login");
		
		Actions n1=  new Actions(n);
		n1.click(d2).build().perform();
		n1.doubleClick(d2).build().perform();
		n1.contextClick(d2).build().perform();
		n1.clickAndHold(d2).build().perform();
		Thread.sleep(3000);
		n1.release(d2).build().perform();
		

	}
	

}
