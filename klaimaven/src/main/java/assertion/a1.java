package assertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {
	@Test
	public void hard()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		Assert.assertEquals(n.getTitle(), "Google");
		Assert.assertNotEquals(n.getTitle(), "opera");
		WebElement d2 = n.findElementByLinkText("Images");
		Assert.assertTrue(d2.isDisplayed());
		Assert.assertFalse(d2.isSelected());
		n.quit();
		
	}

}
