package get_methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a5 {
	
	@Test
	public void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.facebook.com");
		
		n.switchTo().frame(0);
		
		n.executeScript("alert('kavi ')");
		Thread.sleep(3000);
		
		Alert n1 = n.switchTo().alert();
		n1.accept();
	}
	

}
