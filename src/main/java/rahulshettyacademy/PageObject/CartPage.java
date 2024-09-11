package rahulshettyacademy.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;
import rahulshettyacademy.AbstractComponents.AbstractComponenets;

public class CartPage extends AbstractComponenets
{

	WebDriver driver;
	public CartPage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

	
	@FindBy(css=".infoWrap h3")
	List<WebElement> cartProducts;
	
	@FindBy(xpath="(.//button[@class='btn btn-primary'])[3]")
	WebElement checkout;
	
	public boolean validateCartProduct(String productName) throws InterruptedException
	{
		Thread.sleep(3000);
		goToCartPage();
		boolean match = cartProducts.stream().anyMatch(item->item.getText().equalsIgnoreCase(productName));
		return match;
	}
	
	public CheckoutPage goToCheckoutPage() throws InterruptedException 
	{
	
		checkout.click();
		CheckoutPage checkoutPage=new CheckoutPage(driver);
		return checkoutPage;
		
	}
}
