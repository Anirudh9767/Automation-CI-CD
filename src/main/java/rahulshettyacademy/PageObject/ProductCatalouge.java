package rahulshettyacademy.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponenets;

public class ProductCatalouge extends AbstractComponenets
{
	WebDriver driver;
 
	public ProductCatalouge(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	By productBy=By.cssSelector(".mb-3");
	
	By cart=By.cssSelector(".btn.w-10.rounded");
	
	By toastMsg=By.id("toast-container");
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	public List<WebElement> getProductList()
	{
		waitUntilVisibilityOfLocator(productBy);
		return products;
	}
	
	public WebElement getProduct(String productName)
	{
		WebElement desiredproduct = getProductList().stream().filter(product->product.findElement(By.cssSelector("b")).getText().equalsIgnoreCase(productName)).findFirst().orElse(null);
		return desiredproduct;
	}
	
	public void addToCart(String productName)
	{
	  WebElement prod = getProduct(productName);
	  prod.findElement(cart).click();
	  waitUntilVisibilityOfLocator(toastMsg);
	  waitUntilElementToDisappear(spinner);
	  
	}
	
}
