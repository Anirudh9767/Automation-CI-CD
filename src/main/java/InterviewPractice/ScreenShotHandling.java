package InterviewPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotHandling {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		TakesScreenshot s=(TakesScreenshot)driver;
//		File src = s.getScreenshotAs(OutputType.FILE);
//		File des=new File("D:\\ScreenShot.png");
//		FileUtils.copyFile(src, des);
		

		TakesScreenshot tk=(TakesScreenshot) driver; 
		File source= tk.getScreenshotAs(OutputType.FILE); 
		File des=new File("D:\\ScreenShot.png"); 
		FileUtils.copyFile(source,des ); 
	}

}
