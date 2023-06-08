package autoit;
import org.openqa.selenium.chrome.ChromeDriver;
public class auto1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//classname objectname= new classname();
		ChromeDriver ob= new ChromeDriver();
		ob.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(3000);
		ob.findElementByCssSelector("#addBtn").click();
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("D:\\Fileupload.exe");


	}

}
