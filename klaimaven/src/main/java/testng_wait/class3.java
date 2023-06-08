package testng_wait;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class class3 {
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver","C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		n.get("https://www.leetcode.com");
		
		n.findElementByName("q").sendKeys("leetcode");
		n.findElementByCssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b").click();
        n.findElementByXPath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3").click();
        n.findElementByXPath("/html/body/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/div/div/div[2]/div/a[5]/span").click();
        n.findElementByXPath("//*[@id=\"id_login\"]").sendKeys("kaviyarasu2426");
        n.findElementById("id_password").sendKeys("kavi24268");
        n.findElementByClassName("btn-content__2V4r").click();
	}

}
