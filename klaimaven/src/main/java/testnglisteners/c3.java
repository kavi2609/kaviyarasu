package testnglisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class c3 implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("test case start!!!");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("test case failure!!!");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("test case skipped!!!");
	}

	

	public void onFinish(ITestContext context) {
		System.out.println("test case finsh!!!");
	}

}
