package externreport;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class c4 {
	ExtentTest test;
	ExtentReports report;
	@BeforeClass
	public void starttest() {
		 report = new ExtentReports("C:\\Users\\Admin\\git\\kaviyarasu\\klaimaven\\src\\main\\java\\externreport.ka.html");
		 test=report.startTest("c4");
		 
		 test.log(LogStatus.FAIL, "it may be fail project");
		 test.log(LogStatus.INFO, "in before class");
	}
	
	@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.filpkart.com");
		
		Assert.assertEquals(driver.getTitle(), "Filpkart");
		test.log(LogStatus.PASS, "in test case pass");
		test.setDescription("about filpkart page");
		
		
		
	}
	@AfterClass
	public void endtest() {
		test.log(LogStatus.INFO, "in after class");
		report.endTest(test);
		report.flush();
	}

	
	}


