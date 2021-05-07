package com.qa.assignment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.assignment.base.BasePage;
import com.qa.assignment.utils.ElementUtil;

public class ShoppingCart extends BasePage{

	
	private WebDriver driver;
	ElementUtil elementUtil;
	
	// 1. By Locators: 
	
	private By accountHeader = By.className("page-heading");
	private By dressButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	private By product1 = By.xpath("//*[@class=\"replace-2x img-responsive\"]");
	private By addToCartButton = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	private By crossButton = By.className("cross");
	private By shoppingCart = By.className("shopping_cart");	
	private By summaryHeader = By.xpath("//*[@id=\"cart_title\"]");
	private By deliveryAddress= By.className("col-xs-12 col-sm-6"); 
	private By invoiceAddress= By.className("address last_item alternate_item box");
	private By cartSummary= By.id("cart_summary");
	private By checkoutButton = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	private By checkoutButton2 = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	private By termsOfService = By.id("cgv");
	private By checkoutButton3 = By.xpath("//*[@id=\"form\"]/p/button");
	private By paymentMode = By.xpath("//*[@class=\"bankwire\"]");
	private By payoutButton = By.xpath("//*[@class=\"button btn btn-default button-medium\"]");	
	private By orderCompleteMsg = By.xpath("//*[text()=\"Your order on My Store is complete.\"]");
	
	// 2. Constructor of the page class:

	
	public ShoppingCart (WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);		
	}
	
	// 3. page actions: features(Behavior) of the page in the form methods:

	
	public String getAccountPageTitle() {
	return driver.getTitle();
	
}
	public String getAccountUrl() {
		return driver.getCurrentUrl();
		
	}
	public String accountHeadertext() {
		if (elementUtil.doIsDisplayed(accountHeader)) {
			return elementUtil.doGetText(accountHeader);
		}
		return null;
	}
	
	public void shopping() {
		elementUtil.doClick(dressButton);
		elementUtil.doClick(product1);		
		elementUtil.doClick(addToCartButton);
		elementUtil.doClick(crossButton);
		elementUtil.doClick(shoppingCart);
	
	}	

	
	public boolean deliveryAddressDisplayed() {
			
		return elementUtil.doIsDisplayed(deliveryAddress);
	}
		
	public boolean invoiceAddressDisplayed() {
			
		return elementUtil.doIsDisplayed(invoiceAddress);
		
	}
	

	public boolean cartSummaryvisible() {
	
	return elementUtil.doIsDisplayed(cartSummary);

}

	
	public void checkoutCheck() {
		

	elementUtil.doClick(checkoutButton);
	elementUtil.doClick(checkoutButton2);
}
	
	public void paymentProcess() {
		
		elementUtil.doClick(termsOfService);
		
		
		elementUtil.doClick(checkoutButton3);
		elementUtil.doClick(paymentMode);
		elementUtil.doClick(payoutButton);
		
		

	}
		public boolean myOrderComplete() {
			
			return elementUtil.doIsDisplayed(orderCompleteMsg);
			
		}
		
		
	}
	
	
	
	

