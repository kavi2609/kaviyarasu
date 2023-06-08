package extrn;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class c1 {
	ExtentReports report;
	 ExtentTest test;
	 @BeforeClass
	public void starttest()
	{
		 report = new ExtentReports("C:\\Users\\Admin\\eclipse-workspace\\klaimaven\\src\\main\\java\\extrn\\m.html");
		 test = report.startTest("c1");
		 
		 test.log(LogStatus.ERROR, "it may fail class");
		 test.log(LogStatus.INFO, "it before class");
		 
		
		 
	}
	 @Test
	 public void main()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\\\chromedriver_win32 (2)\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			
			Assert.assertEquals(driver.getTitle(), "Google");
			test.log(LogStatus.PASS,"test case passed");
		    test.setDescription("about google ");
	 }
	 @AfterClass
	 public void report()
	 {
		 test.log(LogStatus.INFO, "in after class");
		 report.endTest(test);
		 report.flush();
	 }
	
	

}
