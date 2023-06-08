package externreport;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class c3 {
	
	
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void starttest() {
	
	 report = new ExtentReports("C:\\Users\\\\Admin\\eclipse-workspace\\klaimaven\\src\\main\\java\\externreport\\kk.html");
	 test = report.startTest("c3");
	 
	test.log(LogStatus.ERROR, "it may be fail");
	test.log(LogStatus.INFO, "in before class");
	
	
	}
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		Assert.assertEquals(driver.getTitle(), "Google");
		test.log(LogStatus.PASS, "test case pased");
		test.setDescription("about google page");
	}
	@AfterClass
	public void endtest()
	{
		test.log(LogStatus.INFO, "in after class");
		report.endTest(test);
		report.flush();
	}
}
