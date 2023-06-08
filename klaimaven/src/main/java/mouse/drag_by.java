package mouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
public class drag_by {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://jqueryui.com/droppable/");
		
		n.switchTo().frame(0);
		
		Actions n1= new Actions(n);
		
		WebElement n3 = n.findElementById("draggable");
		WebElement n4 = n.findElementById("droppable");
		
		n1.dragAndDrop(n3, n4).build().perform();

	}

}
