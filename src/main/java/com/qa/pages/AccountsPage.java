package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.utils.ElementUtils;

public class AccountsPage {
	
	private ElementUtils utils;
	
	//locator added newly
	
	By headerlist = By.xpath("//h2[contains(text(),'Account')]/..//ul/li/a/h3");
	By menubar =By.xpath("//ul[@class='menu-category level-1']/li/a/span");
	By shopnow =By.xpath("//div[@class='bestie-btn-wrap']/a[contains(text(),'Shop Now')]");
	
	public AccountsPage(WebDriver driver){
		this.utils=new ElementUtils(driver);
		
	}
	
	//page title
	public String pageTitle() {
		return utils.getPageTitle();
	}
	
	public void getHeadersList() {
		utils.getListofElements(headerlist);
	}
	public void getMenuDetails() {
		utils.getListofElements(menubar);
		
		}
	public void clickShopNow() throws InterruptedException {
		utils.reFreshPage();
		
	}
	
	
	

}
