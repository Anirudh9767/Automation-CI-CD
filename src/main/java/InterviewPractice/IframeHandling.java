package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeHandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement frame = driver.findElement(By.xpath(".//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(frame);
		System.out.println(driver.findElement(By.linkText("Courses")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.id("mousehover")).getText());

	}

}
