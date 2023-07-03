package get_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//get text
		//n.navigate().refresh();
		
		WebElement d1 = n.findElementByTagName("a");
		String d2 = d1.getText();
		System.out.println(d2);
		
		n.findElement(By.name("q")).sendKeys("filpkart",Keys.ENTER);
		
		n.findElementByXPath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3").click();
		
//		String text = n.findElementByClassName("_2Xfa2_").getText();
//		System.out.println(text);
		
		String d5 = n.findElementByName("q").getAttribute("placeholder");
		System.out.println(d5);
		n.quit();

	}

}
