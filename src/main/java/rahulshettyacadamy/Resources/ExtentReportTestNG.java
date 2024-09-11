package rahulshettyacadamy.Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTestNG
{
	ExtentReports extent;
	
	public static ExtentReports  extentReportConfig()
	{
		
		String path = "C:\\Users\\india\\eclipse-workspace\\ExtentReport";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Results");
		reporter.config().setReportName("Web Automation Results");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Anirudh");
		return extent;
	}

}
