package com.qa.assignment.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.assignment.base.BasePage;
import com.qa.assignment.utils.ElementUtil;


public class LoginPage extends BasePage{

	private WebDriver driver;
	ElementUtil elementUtil;

	// 1. By Locators: OR
	
	private By signinLink = By.className("login");
	private By emailaddress = By.id("email");
	private By password = By.id("passwd");
	private By submitbutton = By.id("SubmitLogin");
	private By forgotPwdLink = By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"); // fix the xpath
	// 2. Constructor of the page class:

		public LoginPage(WebDriver driver) {
			this.driver = driver;
			elementUtil = new ElementUtil(this.driver);
		}

		// 3. page actions: features(Behavior) of the page in the form methods:
	
		public void signin() {
			elementUtil.doClick(signinLink);
			
			}
		
		
		public String getLoginPageTitle() {
			return driver.getTitle();
			
		}
		
		
		public void doLogin(String un, String pwd) {

			System.out.println("Login with :" + un + " and " + pwd);
			
			elementUtil.doSendKeys(emailaddress, un);
			elementUtil.doSendKeys(password, pwd);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			elementUtil.doClick(submitbutton);

			
		}
		
		public boolean isForgotPwdLinkExist() {
			
			return elementUtil.doIsDisplayed(forgotPwdLink);
			
		}
		
			
		
}
