package rahulshettyacademy.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponenets;

public class CheckoutPage extends AbstractComponenets
{
	WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement selectCountry;
	
	
	@FindBy(css=".btnn.action__submit.ng-star-inserted")
	WebElement placeOrder;
	
	public void selectCountryName(String countryName) throws InterruptedException 
	{
		
//		Actions a=new Actions(driver);
//		a.sendKeys(selectCountry,countryName).build().perform();
		driver.findElement(By.cssSelector("[placeholder='Select Country']")).sendKeys(countryName);
		waitUntilVisibilityOfLocator(By.cssSelector(".ta-results"));
		driver.findElement(By.xpath(".//button[@class='ta-item list-group-item ng-star-inserted'][2]")).click();
		
	}
	public ConfirmationPage goToConfirmPage()
	{
		placeOrder.click();
		ConfirmationPage confirmPage=new ConfirmationPage(driver);
		return confirmPage;
	}

}
