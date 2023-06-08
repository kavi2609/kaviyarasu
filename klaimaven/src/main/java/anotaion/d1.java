package anotaion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class d1 {
	ChromeDriver n;
	@BeforeMethod
	public void bm()
	{
		n.navigate().refresh();
		System.out.println("before method");
	}
	@AfterMethod
	public void am()
	{
		n.manage().deleteAllCookies();
		System.out.println(" after method");
	}
	
	@BeforeClass
	public void bc()
	{
		n.manage().window().maximize();
		System.out.println("before class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println(n.getTitle());
		System.out.println("after class");
	}
	
	@Test(priority=0)
	public void test1()
	{
		
		System.out.println("test case 1"+n.getCurrentUrl());
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
         n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		
		System.out.println("before test");
	}
	
	@AfterTest
	public void aft() throws InterruptedException
	{
		Thread.sleep(3000);
		n.quit();
		
		System.out.println("after test : closing" );
	}
	
	
	@Test(priority=1)
	public void test2()
	{
		n.findElementByLinkText("Images").click();
		System.out.println("test case 2");
	}

}
