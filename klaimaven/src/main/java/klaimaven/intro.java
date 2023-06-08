package klaimaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class intro {
	@Test
	
	public  void main() throws IOException, InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		

		
		
		n.manage().window().maximize();
		
		n.findElementByXPath("//*[@id=\"APjFqb\"]").sendKeys("cryptocurrency");
		
		
		n.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]").click();
		
		
		n.findElementByCssSelector("#rso > div:nth-child(3) > div > div > div.Z26q7c.UK95Uc.jGGQ5e > div > a > h3").click();
        Thread.sleep(2000);
        
        //n.findElementByXPath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div[4]/table/thead/tr/th[4]/div/div/p").click();
        
       
        n.findElementByXPath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div[4]/table/thead/tr/th[4]/div/div/p").click();
        
		
		File f=n.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Admin\\eclipse-workspace\\klaimaven\\src\\main\\java\\klaimaven\\k.png"));
	}

}
