package InterviewPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethods {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		Actions a=new Actions(driver);
//		WebElement courses = driver.findElement(By.linkText("COURSES"));
//		a.moveToElement(courses).build().perform();
		
		WebElement hostels = driver.findElement(By.xpath(".//a[text()='HOSTEL']"));
		a.contextClick(hostels).build().perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		WebElement draggable = driver.findElement(By.xpath("(.//a[@class='button button-orange'])[2]"));
//		WebElement droppable = driver.findElement(By.xpath("(.//ol[@class='field13 ui-droppable ui-sortable'])[1]"));
////		a.dragAndDrop(draggable, droppable).build().perform();
//		a.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
		
		
		

	}

}
