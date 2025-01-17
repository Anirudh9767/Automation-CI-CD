package rahulshettyacademy.TestComponent;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import rahulshettyacadamy.Resources.ExtentReportTestNG;

public class Listners extends BaseTest implements ITestListener
{
	ExtentTest test;
    ExtentReports extent=ExtentReportTestNG.extentReportConfig();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	    test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	   test.log(Status.PASS,"Status Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
////		test.fail(result.getThrowable());
////		String file = null;
////		try {
////			driver=(WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		} 
////		try {
////			String file1 = getScreenShot(result.getMethod().getMethodName(),driver);
////		} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
//		
////		test.addScreenCaptureFromPath(file,result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
   
	
}
