package example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class kavi22 {
	ChromeDriver n;
	@DataProvider(name="kavi")
	public static Object[][] DataSet(){
		Object[][] obj= {
				{"vaild user name,password","kaviyarasukavi","kavi2426"},
				{"in vaild us,p","ddd","9opu"},
				{"vaild p,in us","kavi","kavi2426"},
				{"vaild us,in v p","kaviyarasukavi","dhy7"}		
		};
		return obj;			
	}
	@Test(dataProvider="kavi")
	public void DataProvSampleTest(String type,String name,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 n= new ChromeDriver();
		 
		 n.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		 
		 n.get("https://www.facebook.com");
		 
		 n.findElementById("email").sendKeys(name);
		 n.findElementByName("pass").sendKeys(password);
		 n.findElementByName("login").click();
		 
		 if(type.equals("vaild")) {
			 System.out.println(" in home");
			 n.findElementByLinkText("Log in").click();
		 }
		 else
		 {
			 System.out.println(" not vaild");
			 
			
		 }
		 
		
		
		
		
	}
}
