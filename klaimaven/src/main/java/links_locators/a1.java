package links_locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\\\chromedriver_win32 (2)\\chromedriver.exe");
			ChromeDriver n = new ChromeDriver();
			n.get("https://www.google.com");
			
			List<WebElement> l1 = n.findElementsByTagName("a");
			System.out.println("number of links"+l1.size());
			
			for(WebElement k:l1) {
				System.out.println(k.getAttribute("href"));
			}
			n.quit();
	}

}
