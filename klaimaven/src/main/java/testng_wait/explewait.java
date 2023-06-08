package testng_wait;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explewait {
	/*
	 * testng synchronisation/webdriver wait
	 *  
	 *    unconditional synchronisation :   implicit wait
	 *    conditional   synchronisation :     explicit wait 
	 * explicit wait: time is applicable for particular condition
	 * 
	 * create an object for webdriver wait class 
	 * pass driver object and time limit as input
	 * call untill methd
	 * call conditio s
	 * 
	 * 
	 * code s correct: executes within time limit, it will proceed further , it will not wait for cmpletion of time limit
	 * code s wrong : it will wait for completion of time limit, then it will throw up error 
	 * 
	 * */
	
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//create an object for chromedriver class
		 ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com");
		WebDriverWait w= new WebDriverWait(c,1);
		
		//title
		//w.until(ExpectedConditions.titleIs("God"));//6
		//w.until(ExpectedConditions.titleContains("oo"));//6
		
		//alert is present
		//w.until(ExpectedConditions.alertIsPresent()); //6
		
		// checking visibility of element
		// finding the element and checking its visibility
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail"))); //6
		
		
		// collect all the images and check its visibility
		// images=> check its visibility
	//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));//6
		
		// element is clickable or not
		// find the element and check whther it is clickable
		//w.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail"))); //6
		
		c.quit();
	}

}
