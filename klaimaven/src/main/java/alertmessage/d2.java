package alertmessage;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
public class d2 {
	
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		n.get("https://www.google.com");
		
		n.executeScript("alert('time out ')");
		
		Thread.sleep(3000);
		Alert a1 = n.switchTo().alert();
		a1.accept();
		
		
	}

}
