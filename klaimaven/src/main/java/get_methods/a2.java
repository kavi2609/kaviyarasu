package get_methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> le = n.findElementsByTagName("a");
		System.out.println("number links"+le.size());
		
		List<WebElement> l2 = n.findElementsByTagName("div");
		System.out.println("number elements"+le.size());
		
		
	}

}
