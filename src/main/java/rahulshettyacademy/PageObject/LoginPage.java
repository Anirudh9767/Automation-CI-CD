package rahulshettyacademy.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponenets;

public class LoginPage extends AbstractComponenets
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	@FindBy(css="div[class*='flyInOut']")
	WebElement errMsg;
	
	public void goToWebsite()
	{
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	public ProductCatalouge login(String email,String pass)
	{
		userEmail.sendKeys(email);
		userPassword.sendKeys(pass);
		loginButton.click();
		ProductCatalouge productCatalouge=new ProductCatalouge(driver);
		return productCatalouge;
		
	}
	
	public String failed()
	{
	    waitForElementToAppear(errMsg);
		return errMsg.getText();
		
	}

}
