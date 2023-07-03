package get_methods;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class a6 {
	@Test
	public void mani() {
	System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeDriver n= new ChromeDriver();
	
	n.get("https://jqueryui.com/droppable/");
	
	n.switchTo().frame(0);
	
	Actions n1= new Actions(n);
	
	WebElement a1 = n.findElementById("draggable");
	WebElement a2 = n.findElementById("droppable");
	
	n1.dragAndDrop(a1, a2).build().perform();

	
	}

}
