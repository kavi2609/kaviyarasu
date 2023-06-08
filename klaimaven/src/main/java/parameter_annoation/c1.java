package parameter_annoation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class c1 {
	@Parameters({"u","v"})
	@Test
	public void main(String username,String password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		ChromeDriver n= new ChromeDriver();
		 
		 n.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		 n.get("https://www.gmail.com");
		 
		 n.findElementById("identifierId").sendKeys(username);
		 n.findElementByClassName("VfPpkd-vQzf8d").click();
		 n.findElementByName("Passwd").sendKeys(password);
		 n.findElementByClassName("VfPpkd-vQzf8d").click();
	}

}
