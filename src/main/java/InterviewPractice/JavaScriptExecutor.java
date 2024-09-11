package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-500)");
		
//		for(int i=0;i<10;i++)
//		{
//			js.executeScript("window.scrollBy(0,500)");
//			Thread.sleep(1000);
//			js.executeScript("window.scrollBy(0,-500)");
//		}
		
		WebElement path = driver.findElement(By.id("mousehover"));
		js.executeScript("arguments[0].scrollIntoView(true)", path);
		Thread.sleep(1000);
//		WebElement path2 = driver.findElement(By.id("displayed-text"));
//		js.executeScript("argument[0].scrollIntoView(true)", path2);
//		js.executeScript("document.getElementId('displayed-text').setAttribute('value','Hello')");
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: solid 2px red');",path); 

	}

}
