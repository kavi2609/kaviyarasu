package externreport;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class c2 {
	ExtentReports report;
	ExtentTest test;
	@BeforeClass
	public  void startTest()
	{
	//creating an object for extent reports class, pass path as input, globally
	report = new ExtentReports("C:\\Users\\Admin\\eclipse-workspace\\klaimaven\\src\\main\\java\\externreport\\kavi.html");
	// test start ,finish, loging
	test = report.startTest("c2");

	test.log(LogStatus.ERROR,"it may fail");
	test.log(LogStatus.INFO,"in before class");
	test.assignAuthor("kavi");
	test.assignCategory("google report");

	}
	@Test
	public void extentReportsDemo()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	Assert.assertEquals(driver.getTitle(),"Google");
	test.log(LogStatus.PASS,"Test case passed ");
	test.setDescription("this is about google");
	driver.quit();

	}

	@AfterClass
	public void endTest()
	{
	test.log(LogStatus.INFO,"in after class");
	report.endTest(test);
	report.flush();
	}
	

}
