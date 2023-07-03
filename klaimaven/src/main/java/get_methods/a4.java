package get_methods;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.facebook.com");
		
		WebElement n1 = n.findElementByName("login");
		
		n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions ac= new Actions(n);
		
		//ac.click(n1).build().perform();
		//ac.doubleClick(n1).build().perform();
		//ac.moveToElement(n1).click().build().perform();
		
		
		ac.clickAndHold(n1).build().perform();
		Thread.sleep(-4000);
		ac.release(n1).build().perform();
		
		

	}

}
