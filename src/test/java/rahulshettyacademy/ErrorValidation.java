package rahulshettyacademy;

import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.PageObject.ProductCatalouge;
import rahulshettyacademy.TestComponent.BaseTest;

public class ErrorValidation extends BaseTest
{
    @Test
	public void  ErrorValidationTest()
	{
    	loginPage.login("ani@gmail.com", "ani@123");
    	Assert.assertEquals("Incorjgfd",loginPage.failed());
	}
    
   
}
