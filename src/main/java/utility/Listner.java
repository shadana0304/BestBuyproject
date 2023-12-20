package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listner implements ITestListener {
	
	ExtentTest test;
	ExtentReports extents=ExtendReportsBestBuy.getReport();

	public void onTestStart(ITestResult result) {
		
		test=extents.createTest(result.getMethod().getMethodName());
		System.out.println("Test Started");
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test Passed");
		System.out.println("Test Success");
	}

	public void onTestFailure(ITestResult result) {
		
		test.fail(result.getThrowable());
		System.out.println("Test Failed");
		
		String filepath=null;
		
		filepath=capture(result.getMethod().getMethodName());
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}

	
	private String capture(String methodName) {
		
		return null;
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Skipped");
	}

	/*public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}*/

	public void onFinish(ITestContext context) {
		
		extents.flush();
		System.out.println("Test Finished");
	}

}
