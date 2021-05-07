package com.qa.assignment.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.assignment.base.BaseTest;
import com.qa.assignment.utils.Constants;



public class LoginPageTest extends BaseTest{

	@Test(priority = 1)
	public void signinTest() {
		loginPage.signin();
	
	}
	
	@Test(priority = 2)
	public void getLoginPageTitleTest() {
		
		String title = loginPage.getLoginPageTitle();
		System.out.println("login page title is : " + title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}
	
	@Test(priority = 3)
	public void verifyForgotPwdLinkTest() {
		
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}
	
	@Test(priority = 4)
	public void loginTest() {
		
		loginPage.doLogin(prop.getProperty("emailaddress"), prop.getProperty("password"));
		
		String url = driver.getCurrentUrl();
		System.out.println("After login the url is : " + url);
		
	}
	
	
	
	
	}

