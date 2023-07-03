package get_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	ChromeDriver n;
	@DataProvider(name= "kaviyarasu")
	public static Object[][] DataSet(){
		
		Object[][] obj= {
				{"vaild us,vaild p","kaviyarasukavi","kavi2426"},
				{"in vaildus,p","k90","9087"},	
		};
		return obj;		
	}
     @Test(dataProvider = "kaviyarasu")
     public void data(String type,String username,String password) throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		   n= new ChromeDriver();
		  n.get("https://www.facebook.com");
		  
		  n.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		  
		  
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
				Thread.sleep(4000);
				n.quit();
			}
     }
}
