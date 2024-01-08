package utilities;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListensTestNG extends CommonMethods implements ITestListener{
	
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test start: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successfully executed: " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has failed: " + result.getName());
		takeScreenShot(getDriver());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Bug Busters project test start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Bug Busters project test finished");
	}
	

}
