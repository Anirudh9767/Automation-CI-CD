package rahulshettyacademy.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rahulshettyacademy.PageObject.CartPage;
import rahulshettyacademy.PageObject.OrdersPage;

public class AbstractComponenets 
{

	WebDriver driver;
	public AbstractComponenets(WebDriver driver)
	{
		this.driver=driver;
		
	}

	@FindBy(css="button[routerlink='/dashboard/cart']")
	WebElement cart;
	@FindBy(css="button[routerlink*='myorders']")
	WebElement orders;
	
	
	public void waitUntilVisibilityOfLocator(By findby)
	{
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
		
	}
	
	public void waitUntilElementToDisappear(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
	public CartPage goToCartPage() throws InterruptedException 
	{
		Thread.sleep(2000);
		cart.click();
		CartPage cartPage=new CartPage(driver);
		return cartPage;
		
	}
	
	public OrdersPage goToOrders()
	{
		orders.click();
		OrdersPage orderPage=new OrdersPage(driver);
		return orderPage;
	}
	
	public void waitForElementToAppear(WebElement findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}
}
