package assertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class d3 {
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		Assert.assertEquals(n.getTitle(), "Google");
		Assert.assertNotEquals(n.getTitle(), "yahoo");
		WebElement d = n.findElementByLinkText("Images");
		Assert.assertTrue(d.isDisplayed());
		Assert.assertFalse(d.isSelected());
		n.quit();
	}

}
