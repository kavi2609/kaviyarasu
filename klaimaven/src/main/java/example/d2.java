package example;
import org.openqa.selenium.chrome.ChromeDriver;
public class d2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		n.get("https://www.google.com");
		
		n.findElementByName("q").sendKeys("whatsapp");
		n.findElementByXPath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]").click();
		n.findElementByClassName("l").click();
	}

}
