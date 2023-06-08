package log4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class logs {

	//static Logger log= LogManager.getLogger(c2.class);
	static Logger log = LogManager.getLogger(logs.class);
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.letskodeit.com/practice");
		
		log.info("visitesd web site");
		log.info("click on the login button");
		
		

	}

}
