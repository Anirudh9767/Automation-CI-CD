package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://ironspider.ca/forms/dropdowns.htm");
		WebElement listbox = driver.findElement(By.tagName("select"));
		Select s=new Select(listbox);
		List<WebElement> options = s.getOptions();
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		//Select By index
		s.selectByIndex(2);
		
		//Select By visible text
		s.selectByVisibleText("With cream & sugar");
		
		//Select By value
		s.selectByValue("crisp");
	    
		WebElement lisbox2 = driver.findElement(By.name("coffee2"));
		Select s2=new Select(lisbox2);
		System.out.println(s2.isMultiple());
		Thread.sleep(2000);
		s2.selectByVisibleText("Skim Milk");
		s2.selectByVisibleText("A muffin");
		List<WebElement> options2 = s2.getAllSelectedOptions();
		for(WebElement option:options2)
		{
			System.out.println(option.getText());
		}
	    System.out.println(s2.getFirstSelectedOption());
	
		
		s2.deselectByVisibleText("Skim Milk");
		s2.deselectAll();
		
		
		
		

	}

}
