package testng_wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class d3 {
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		ChromeDriver n= new ChromeDriver();
		 
		n.get("https://www.facebook.com");
		
		WebDriverWait n1= new WebDriverWait(n, 4);
		
		//n1.until(ExpectedConditions.titleIs("facebook"));
		//n1.until(ExpectedConditions.titleContains("oo"));
		//n1.until(ExpectedConditions.alertIsPresent());
		//n1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Log in")));
		//n1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("img")));
		//n1.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
		n.quit();
		
	}

}
