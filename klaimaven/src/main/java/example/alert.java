package example;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert {
	
	@Test
	public void main() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		n.switchTo().frame(0);
		n.executeScript("alert('time limit')");
		
		Thread.sleep(3000);
		Alert a = n.switchTo().alert();
		a.accept();
		n.quit();
		
	}

}
