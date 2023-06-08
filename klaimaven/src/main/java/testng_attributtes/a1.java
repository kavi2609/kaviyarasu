package testng_attributtes;

import org.testng.annotations.Test;

public class a1 {
	
	@Test(priority=0,groups="one",description="book")
	public void sin()
	{
		System.out.println("sign up");
	}
	@Test(priority=1,groups="one")
	public void log()
	{
		System.out.println("login ");
	}
	@Test(priority=2,groups="two",invocationCount=2)
	public void serach()
	{
		System.out.println("product search");
	}
	@Test(priority=3,groups="two")
	public void get()
	{
		System.out.println("get product");
	}

}
