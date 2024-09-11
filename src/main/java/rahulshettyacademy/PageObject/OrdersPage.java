package rahulshettyacademy.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponenets;

public class OrdersPage extends AbstractComponenets
{
    WebDriver driver;
	public OrdersPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="tr td:nth-child(3)")
	List<WebElement> productsName;
	
	public boolean verifyOrders(String productName)
	{
		boolean match = productsName.stream().anyMatch(item->item.getText().equalsIgnoreCase(productName));
		return match;
	}

	
}
