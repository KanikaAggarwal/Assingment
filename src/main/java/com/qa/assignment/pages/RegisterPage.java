package com.qa.assignment.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.assignment.base.BasePage;
import com.qa.assignment.utils.ElementUtil;

public class RegisterPage extends BasePage	 {
	
	private WebDriver driver;
	ElementUtil elementUtil;
	
	// 1. By Locators: OR
		private By signinLink = By.className("login");
		private By createAccountBox = By.id("create-account_form");
		private By emailIdText = By.id("email_create");
		private By createButton = By.id("SubmitCreate");
	
	private By mrRadioButton = By.id("id_gender1");
	private By mrsRadioButton = By.id("id_gender2");
	private By firstname = By.id("customer_firstname");
	private By lastname = By.id("customer_lastname");
	//private By email = By.id("email");
	private By password = By.id("passwd");
	private By daysDropbox = By.id("days");
	private By monthsDropbox = By.id("months");
	private By yearsDropbox = By.id("years");
	private By newsletterCheckBox = By.id("newsletter");
	private By specialofferCheckBoc = By.id("optin");
	private By firstnameAddressForm = By.id("firstname");
	private By lastnameAddressForm = By.id("lastname");
	private By companyName = By.id("company");
	private By addressLine1 = By.id("address1");
	private By addressLine2 = By.id("address2");
	private By city = By.id("city");
	private By postalcode = By.id("postcode");
	private By stateDropbox = By.id("id_state");
	private By countryDropbox = By.id("id_country");
	private By additionalinfo = By.id("other");
	private By homephone = By.id("phone");
	private By mobilenumber = By.id("phone_mobile");
	private By addressalias = By.id("alias");
	private By registerButton = By.id("submitAccount");
	
	// 2. Constructor of the page class:
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);		
	}
	
	// 3. page actions: features(Behavior) of the page in the form methods:

	
	public String getPageTitle() {
		return driver.getTitle();
		
	}

	public void signin() {
	elementUtil.doClick(signinLink);
	String signinurl = driver.getCurrentUrl();
	System.out.println("Signin URL is: " + signinurl);
	}
	
	public boolean createAccount() {
		
		if (driver.findElement(createAccountBox).isDisplayed()) {
			return true;
		}
		return false;
		
	}
	
	public void emailAddressInput() {
		
		elementUtil.doSendKeys(emailIdText,"kanika@gmail.com");
		elementUtil.doClick(createButton);
					
	}
	public void userRegistration() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(mrRadioButton).click();
		driver.findElement(firstname).sendKeys("Tom");
		driver.findElement(lastname).sendKeys("Hage");
		// driver.findElement(email).sendKeys("kanika.aggarwal1215@gmail.com");
		driver.findElement(password).sendKeys("Tom123");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select daysDropdown = new Select(driver.findElement(daysDropbox));
		daysDropdown.selectByValue("12");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select monthsDropdown = new Select(driver.findElement(monthsDropbox));
		monthsDropdown.selectByIndex(8);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Select yearsDropdown = new Select(driver.findElement(yearsDropbox));
		yearsDropdown.selectByValue("1990");		
		
		driver.findElement(newsletterCheckBox).click();
		driver.findElement(specialofferCheckBoc).click();	
		driver.findElement(firstnameAddressForm).sendKeys("Tom");
		driver.findElement(lastnameAddressForm).sendKeys("Hage");
		driver.findElement(companyName).sendKeys("Itera");
		driver.findElement(addressLine1).sendKeys("Mari Gata 61");
		driver.findElement(addressLine2).sendKeys("Apartment number 31");
		driver.findElement(city).sendKeys("Oslo");
		driver.findElement(postalcode).sendKeys("67856");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select stateDropdown = new Select(driver.findElement(stateDropbox));
		stateDropdown.selectByIndex(9);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select countrydropdown = new Select(driver.findElement(countryDropbox));
		countrydropdown.selectByValue("21");
		
		driver.findElement(additionalinfo).sendKeys("I am testing this page");
		driver.findElement(homephone).sendKeys("56473839");
		driver.findElement(mobilenumber).sendKeys("65748398");
		driver.findElement(addressalias).sendKeys("Home Address");
		driver.findElement(registerButton).click();
	}
	
		public String currentPageTitle() {
			return driver.getTitle();
			
		}
		
		
	}
	
	
	

