package rahulshettyacademy.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponenets;

public class ConfirmationPage extends AbstractComponenets 
{
	WebDriver driver;
	public ConfirmationPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName ="h1")
	WebElement msg;
	
	 
	public String getMsg()
	{
	  return msg.getText();
	 
	}

}
