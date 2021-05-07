package com.qa.assignment.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.qa.assignment.pages.LoginPage;
import com.qa.assignment.pages.ShoppingCart;
import com.qa.assignment.pages.RegisterPage;


public class BaseTest {
	
		public BasePage basePage;
		public LoginPage loginPage;
		public RegisterPage registerpage;
		public ShoppingCart shoppingcart;
		
		public Properties prop;
		public WebDriver driver;
		
		@BeforeTest
		public void setUp() {
			
			basePage = new BasePage();
			prop = basePage.init_prop();
			String browser = prop.getProperty("browser");
			driver = basePage.init_driver(browser);
			loginPage = new LoginPage(driver); // for this constructor is created in LoginPage.java
			driver.get(prop.getProperty("url"));
			registerpage = new RegisterPage(driver);
			shoppingcart = new ShoppingCart(driver);
		}
		
		
		public void tearDown() {
			driver.quit();
		 }
		
	}

