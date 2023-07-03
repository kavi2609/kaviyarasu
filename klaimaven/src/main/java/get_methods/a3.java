package get_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		//n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		n.findElement(By.name("q")).sendKeys("claysys",Keys.ENTER);
		
		n.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		n.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
//		n.executeScript("window.scrollBy(0,9000)");
		
//		n.executeScript("window.scrollBy(0,-9000)");
		
		
		
		
		
		
		
		

	}

}
