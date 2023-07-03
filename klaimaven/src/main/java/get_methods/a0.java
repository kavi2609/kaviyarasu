package get_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class a0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.google.com");
		
		
		
//		Dimension n1 = n.manage().window().getSize();
//		System.out.println(n1.getHeight()+"height");
//		System.out.println(n1.getWidth()+"width");
//		
		Point n2 = n.manage().window().getPosition();
		System.out.println("x value is "+ n2.getX());
		System.out.println("y value is "+ n2.getY());
		
		Dimension n1 = new Dimension(900, 400); 
	n.manage().window().setSize(n1);
		
//		Point n2 = new Point(300, 600);
//		n.manage().window().setPosition(n2);
		
		

	}

}
