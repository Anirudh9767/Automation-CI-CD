package rahulshettyacademy;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.PageObject.CartPage;
import rahulshettyacademy.PageObject.CheckoutPage;
import rahulshettyacademy.PageObject.ConfirmationPage;
import rahulshettyacademy.PageObject.LoginPage;
import rahulshettyacademy.PageObject.OrdersPage;
import rahulshettyacademy.PageObject.ProductCatalouge;
import rahulshettyacademy.TestComponent.BaseTest;
import org.testng.TestNG;
public class StandAloneTest extends BaseTest {

	
	@Test
	public void submitOrder() throws InterruptedException, IOException
	{
		String productName = "ZARA COAT 3";
		String countryName="india";
		ProductCatalouge productCatalouge=loginPage.login("walter@gmail.com", "Walter@123");
		List<WebElement> products = productCatalouge.getProductList();
		productCatalouge.addToCart(productName);
	    CartPage cartPage=productCatalouge.goToCartPage();
		cartPage.validateCartProduct(productName);
		CheckoutPage checkoutPage=cartPage.goToCheckoutPage();
		checkoutPage.selectCountryName(countryName);
		ConfirmationPage confirmPage=checkoutPage.goToConfirmPage();
	    String msgText= confirmPage.getMsg();
	    Assert.assertTrue(msgText.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	    
	}
	
	@Test(dependsOnMethods = {"submitOrder"})
	public void ordersTest()
	{
		String productName = "ZARA COAT 3";
		ProductCatalouge productCatalouge=loginPage.login("walter@gmail.com", "Walter@123");
		OrdersPage ordersPage=productCatalouge.goToOrders();
	    Assert.assertTrue(ordersPage.verifyOrders(productName));
	}
}
	


