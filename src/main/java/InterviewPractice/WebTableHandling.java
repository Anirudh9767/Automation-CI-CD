package InterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement tableData = driver.findElement(By.xpath(".//div[@class='tableFixHead']/table/tbody/tr[2]/td[2]"));
		System.out.println(tableData.getText());
		List<WebElement> allTableData = driver.findElements(By.xpath(".//div[@class='tableFixHead']/table/tbody/tr/td"));
		for(WebElement data:allTableData)
		{
			System.out.println(data.getText());
		}
		
		

	}

}
