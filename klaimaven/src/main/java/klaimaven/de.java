package klaimaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

public class de {
        
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		n.findElementByCssSelector("#APjFqb").sendKeys("claysys");
		
		n.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]").click();
		
		
	}

}
