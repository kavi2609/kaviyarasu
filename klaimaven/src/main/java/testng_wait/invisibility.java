package testng_wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class invisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//create an object for chromedriver class
		 ChromeDriver c = new ChromeDriver();
		c.get("https://leetcode.com/");
		WebDriverWait w= new WebDriverWait(c,6);
		c.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		c.findElementByXPath("//*[@id=\"landing-page-app\"]/div/div[1]/div[3]/div[1]/div/div/div[2]/div/a[5]").click();

	}

}
