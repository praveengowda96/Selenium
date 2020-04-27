package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),\"Mobiles\")]")
	WebElement mobileBtn;

	@FindBy(xpath = "//input[@name=\"field-keywords\"]")
	WebElement searchTxt;

	@FindBy(xpath = "//img[@alt=\"Apple iPhone 11 Pro (256GB) - Midnight Green\"]")
	WebElement productIphone;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// this method is used to search product
	public void serachProduct() {
		searchTxt.sendKeys("Iphone 11 Pro");
		searchTxt.submit();
	}

	// this method is used to click on product
	public SearchedProductPage clickOnProduct() {
		productIphone.click();
		return new SearchedProductPage();
	}

}
