package data;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataprovider {
	
	ChromeDriver n;
	@DataProvider(name="kavi")
	public static Object[][] DataSet(){
		
		 Object[][] obj= {
				 {"valid", "kaviyarasu2626@gmail.com", "kavi2426"},//row   00   01  02
	                {"invalid", "DDD", "555"},             //row   10   11  12
	                {"vaild username,invaild p", "kaviyarasu2626@gmail.com","3456"},
	                {"vaild p,invaild us","kaviyarasu78@gmail.com","kavi2426"},
		 };	 
		 return obj;
		 
				 
	}
	@Test(dataProvider="kavi")
	
	public void DataProvSampleTest(String type, String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 n= new ChromeDriver();
		 
		 n.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		 n.get("https://www.gmail.com");
		 
		 n.findElementById("identifierId").sendKeys(username);
		 n.findElementByClassName("VfPpkd-vQzf8d").click();
		 n.findElementByName("Passwd").sendKeys(password);
		 n.findElementByClassName("VfPpkd-vQzf8d").click();
		 
		 if(type.equals("vaild")) {
			 System.out.println(" in home");
			 n.findElementByLinkText("Google").click();
		 }
		 else {
			 System.out.println("invaild");
			 Thread.sleep(2000);
			 n.quit();
		 }
		
	}
		
	}

