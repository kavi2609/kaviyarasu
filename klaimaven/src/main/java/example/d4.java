package example;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
public class d4 {
	
	@Test
	public void mad()
	{
		System.setProperty("webdriver.chrome.driver","C:\\software testing\\selenium\\\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		n.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		n.get("https://www.google.com/");
		
		n.findElement(By.name("q")).sendKeys("claysys",Keys.ENTER);
		
	}

}
