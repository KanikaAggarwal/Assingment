package com.qa.assignment.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.assignment.base.BaseTest;
import com.qa.assignment.utils.Constants;

public class ShoppingCartTest extends BaseTest{
	
	
	@BeforeClass
	public void doLoginSetup() {
		loginPage.signin();
		loginPage.doLogin(prop.getProperty("emailaddress"), prop.getProperty("password"));

	}
	
	@Test(priority = 1)
	public void accountPageTitleTest() {
		String title = shoppingcart.getAccountPageTitle();
		System.out.println("account page title is : " + title);
		Assert.assertEquals(title, Constants.MYACCOUNT_TITLE);
	}
	
	
	@Test(priority = 2)
	public void accountUrlTest() {
		String url = shoppingcart.getAccountUrl();
		System.out.println("account page title is : " + url);
		Assert.assertEquals(url, Constants.MYACCOUNT_URL);
	}
	
	@Test(priority = 3)
	public void accountHeadertextVerify() {
		String headerValue = shoppingcart.accountHeadertext();
		System.out.println("account page header is :" + headerValue);
		Assert.assertEquals(headerValue, Constants.ACCOUNT_PAGE_HEADER);
	}
	
	@Test(priority = 4)
	public void shoppingTest() {
		
		shoppingcart.shopping();
		
//		String headerValue1 = shoppingcart.getHeaderValue();
//		System.out.println("account page header is :" + headerValue1);
//		Assert.assertEquals(headerValue1, Constants.PRODUCT_SUCCESS_HEADER);
		
//		String headerValue2 = shoppingcart.getsummaryHeadertext();
//		System.out.println("account page header is :" + headerValue2);
//		Assert.assertEquals(headerValue2, Constants.SUMMARY_HEADER);
//		
	}
	
//	@Test(priority = 5)
//	public void deliveryAddressVerify() {
//		
//	Assert.assertTrue(shoppingcart.deliveryAddressDisplayed());
//	}
//	
//	@Test(priority = 6)
//	public void invoiceAddressVerify() {
//		
//		Assert.assertTrue(shoppingcart.invoiceAddressDisplayed());
//
//	}

	@Test(priority = 7)
	public void cartSummaryvisibleVerify() {
		
		Assert.assertTrue(shoppingcart.cartSummaryvisible());

	}
	
	@Test(priority = 8)
	public void paymentProcessTest() {
		shoppingcart.checkoutCheck();
		shoppingcart.paymentProcess();
		
	}
	
	@Test (priority = 9)
	public void myOrderCompleteTest() {
		
		Assert.assertTrue(shoppingcart.myOrderComplete());

	}
	
	
}
