package mouse;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class h2 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.seleniumeasy.com");
		
    //  n.executeScript("window.ScrollBY(0,doucement.body.scrollHeight)");
    //  Thread.sleep(3000);
    //  n.executeScript("window.ScrollBY(0,-doucement.body.scrollHeight)");
		
		
		n.executeScript("window.ScrollBy.(0,2000)");
		Thread.sleep(3000);
		n.executeScript("window.ScrollBy.(0,-2000)");
		Thread.sleep(3000);
		
		
		
		
		
		
	}

}}
