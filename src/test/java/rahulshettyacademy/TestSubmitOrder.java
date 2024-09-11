package rahulshettyacademy;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import rahulshettyacademy.PageObject.CartPage;
import rahulshettyacademy.PageObject.CheckoutPage;
import rahulshettyacademy.PageObject.ConfirmationPage;
import rahulshettyacademy.PageObject.ProductCatalouge;
import rahulshettyacademy.TestComponent.BaseTest;

public class TestSubmitOrder extends BaseTest
{
//	String productName = "ZARA COAT 3";
	
	@Test(dataProvider = "getData",groups = {"SubmitOrderTest"})
	public void submitOrder(HashMap<String,String> input) throws InterruptedException, IOException
	{
		String countryName="india";
		ProductCatalouge productCatalouge=loginPage.login(input.get("email"),input.get("password"));
		List<WebElement> products = productCatalouge.getProductList();
		productCatalouge.addToCart(input.get("productName"));
	    CartPage cartPage=productCatalouge.goToCartPage();
		cartPage.validateCartProduct(input.get("productName"));
		CheckoutPage checkoutPage=cartPage.goToCheckoutPage();
		checkoutPage.selectCountryName(countryName);
		ConfirmationPage confirmPage=checkoutPage.goToConfirmPage();
	    String msgText= confirmPage.getMsg();
	    Assert.assertTrue(msgText.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	    
	}
	
//	@DataProvider
//	public Object[][] getData()
//	{
//		return new Object[][] {{"walter@gmail.com","Walter@123","ZARA COAT 3"},{"john1235@gmail.com","John@123","ADIDAS ORIGINAL"}};
//	}
	
//	@DataProvider
//	public Object[][] getData()
//	{
//		HashMap<String,String> map=new HashMap<String, String>();
//		map.put("email", "walter@gmail.com");
//		map.put("password", "Walter@123");
//		map.put("productName", "ZARA COAT 3");
//		
//		HashMap<String,String> map1=new HashMap<String, String>();
//		map.put("email", "john1235@gmail.com");
//		map.put("password", "John@123");
//		map.put("productName", "ADIDAS ORIGINAL");
//		return new Object[][] {{map},{map1}};
//	}
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		List<HashMap<String, String>> data = getJosnDataToHashmap("C:\\Users\\india\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\rahulshettyacademy\\Data\\SubmitOrderData.json");
	    return new Object[][] {{data.get(0)},{data.get(1)}};
	}
	
	
	
	
	
	
	
	
	
	
}
