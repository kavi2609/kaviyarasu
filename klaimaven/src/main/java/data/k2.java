package data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class k2 {
	
	@DataProvider(name= "kavi")
	public static Object[][] DataSet(){
		
		Object[][] obj= {
				{"vaild us,vaild p","kaviyarasukavi","kavi2426"},
				{"in vaildus,p","k90","9087"},	
		};
		return obj;		
	}

	  @Test(dataProvider="kavi")
	  public void DataProSampleTest(String type,String username,String password) {
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
				System.out.println("in vaild");
			}
	  }
	  
}
