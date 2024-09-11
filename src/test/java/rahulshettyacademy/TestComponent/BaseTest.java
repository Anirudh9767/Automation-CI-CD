package rahulshettyacademy.TestComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import rahulshettyacademy.PageObject.LoginPage;

public class BaseTest
{
	WebDriver driver;
	public LoginPage loginPage;
  
	public WebDriver initializeBrowser() throws IOException
	{
	
		FileInputStream fis=new FileInputStream("C:\\Users\\india\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\main\\java\\rahulshettyacadamy\\Resources\\GlobalData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String browserName = System.getProperty("browser")!=null ?System.getProperty("browser"): prop.getProperty("browser");
        if(browserName.equalsIgnoreCase("firefox"))
        {
        	driver=new FirefoxDriver();
        }
       else if (browserName.equalsIgnoreCase("chrome"))
       {
		  driver=new ChromeDriver();
	   }
       else if(browserName.equalsIgnoreCase("edge"))
        {
        	driver=new EdgeDriver();
	    }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        return driver;
	}
	
	
	 
		public List<HashMap<String,String>> getJosnDataToHashmap(String filePath) throws IOException
		{
			String jsonContent = FileUtils.readFileToString(new File(filePath),StandardCharsets.UTF_8);
		
			ObjectMapper mapper=new ObjectMapper();
			List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>() {
			});
			return data;
		}
		
		
		public String getScreenShot(String testcaseName, WebDriver driver) throws IOException
		{
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File source = screenshot.getScreenshotAs(OutputType.FILE);
			File file=new File((System.getProperty("user.dir")+"\\reports\\"+testcaseName+".png"));
			FileUtils.copyFile(source, file);
			return System.getProperty(("user.dir")+"\\reports\\"+testcaseName+".png");
		}
		
	
	@BeforeMethod
	public LoginPage launchApplication() throws IOException
    {
    	driver=initializeBrowser();
        loginPage=new LoginPage(driver);
    	loginPage.goToWebsite();
    	return loginPage;
    }
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	}

