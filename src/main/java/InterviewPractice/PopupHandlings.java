package InterviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupHandlings {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
//		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
//		driver.findElement(By.name("proceed")).submit();
//		driver.switchTo().alert().accept();
//		driver.close();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		Thread.sleep(2000);
//		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("name")).sendKeys("Anirudh");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
