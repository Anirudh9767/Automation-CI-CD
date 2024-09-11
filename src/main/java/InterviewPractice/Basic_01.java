package InterviewPractice;

import java.awt.Dimension;
import java.awt.Point;
import java.util.Scanner;

import javax.swing.text.Position;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_01 {

	public static void main(String[] args) 
	{
//		WebDriver driver=new FirefoxDriver();
//		driver.get("http://www.google.com");
		
		//Navigate Methods
//		driver.navigate().to("http://www.facebook.com");
//		driver.navigate().back();
//		driver.navigate().refresh();
//		driver.navigate().forward();
		
//	  System.out.println(driver.getTitle());
//	  System.out.println(driver.manage().window().getPosition());
//	  System.out.println(driver.manage().window().getSize());
//	  System.out.println(driver.getCurrentUrl());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser Name");
		String browser = sc.next();
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriver driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			WebDriver driver=new FirefoxDriver();
		}
		
		
	  
	  
		
		
		
		
		

	}

}
