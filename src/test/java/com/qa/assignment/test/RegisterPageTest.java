package com.qa.assignment.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.assignment.base.BaseTest;

public class RegisterPageTest extends BaseTest {

	
	
	@BeforeTest
	public void initial() {
		registerpage.signin();
		registerpage.createAccount();
		registerpage.emailAddressInput();
		
	}
		
	@Test
	public void userRegistrationTest() {
		registerpage.userRegistration();
		
	
}
}