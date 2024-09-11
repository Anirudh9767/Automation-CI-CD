package InterviewPractice;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_02 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
//		WebElement logo = driver.findElement(By.cssSelector("img[alt='Facebook']"));
//		if(logo.isDisplayed())
//		{
//			System.out.println("Logo is displaying");
//		}
//		else
//		{
//			System.out.println("Logo is not displaying");
//		}
//       
//		boolean email = driver.findElement(By.id("email")).isEnabled();
//		if(email)
//		{
//			System.out.println("email field is enabled");
//		}
//		else
//		{
//			System.out.println("email field is not enabled");
//		}
		
//		driver.findElement(By.linkText("Sign up for Facebook")).click();
//		WebElement femaleRadioButton = driver.findElement(By.xpath("(.//input[@name='sex'])[1]"));
//		femaleRadioButton.click();
//		if(femaleRadioButton.isSelected())
//		{
//			System.out.println("Radio button is selected");
//		}
//		else
//		{
//			System.out.println("Radio button is not selected");
//		}
		
//		WebElement mail = driver.findElement(By.id("email"));
//		WebElement pass = driver.findElement(By.id("pass"));
//		mail.sendKeys("Hello");
//		pass.sendKeys("Hi");
//		System.out.println(mail.getAttribute("value"));
//		System.out.println(pass.getAttribute("value"));
//	    WebElement loginButton = driver.findElement(By.id("loginbutton"));    
//	    System.out.println(loginButton.getCssValue("background-color"));
//	    System.out.println(loginButton.getCssValue("font-size"));
	    
//	    Keystrokes
	    
	    WebElement email = driver.findElement(By.id("email"));
	    WebElement pass = driver.findElement(By.id("pass"));
	    email.sendKeys("Hello");
	    Thread.sleep(2000);
	    email.sendKeys(Keys.CONTROL+"ac");
	    pass.sendKeys(Keys.CONTROL,"v");
	    
	   System.out.println(email.getRect().getHeight());
	   System.out.println(email.getRect().getWidth());
	   System.out.println(email.getRect().getX());
	   System.out.println(email.getRect().getY());
	   
	    
	   
	   
	   
	   
	   
	}

}
