package data;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data2 {
	
	
	@DataProvider(name="kavi")
	public static Object[][] DataSet(){
		Object[][] obj= {
				{"vaild user,password name","kaviyarasukavi","kavi2426"},
				{"invaild u,p","karpthi23","123"},
				//{"vaild us,invaild p","kaviyarasukavi","4567"},
				//{"invaild us,vaild p","kkk","kavi2426"}
		};
		return obj;
		
	}
	
	@Test(dataProvider="kavi")
	public void DataProvSampleTest(String type,String  username,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		n.get("https://www.facebook.com");
		
		n.findElementById("email").sendKeys(username);
		n.findElementById("pass").sendKeys(password);
		n.findElementByName("login").click();
		
		if(type.equals("vaild"))
		{
			System.out.println("in home");
			n.findElementByLinkText("Log in").click();
		}
		else
		{
			System.out.println(" in vaild");
			Thread.sleep(3000);
			
		}
	}
	
	
}
