package InterviewPractice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_03 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCount = links.size();
		System.out.println(linksCount);
		for(int i=0;i<links.size();i++)
		{
			boolean visibleLinks = links.get(i).isDisplayed();
			if(visibleLinks)
			{	
				
			System.out.println("Visible Links "+links.size());
		   }
			else if(!visibleLinks)
			{
				System.out.println("Invisible Links "+links.size());
			}
			
		}
		

	}

}
