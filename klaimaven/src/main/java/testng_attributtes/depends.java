package testng_attributtes;

import org.testng.annotations.Test;

public class depends {
	
	@Test(priority=0,groups="m")
	public void usern()
	{
		System.out.println("enter user name");
	}
	@Test(priority=0,groups="m",invocationCount=2)
	public void pass()
	{
		System.out.println("enter your password");
	}
	@Test(priority=0,dependsOnGroups="m")
	public void home()
	{
		System.out.println("welcome home page");
	}
	

}
