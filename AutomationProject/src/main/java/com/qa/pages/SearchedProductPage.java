package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SearchedProductPage extends TestBase {

	@FindBy(xpath = "//span[@class=\"a-size-large\"]")
	WebElement productTitle;
	@FindBy(id = "add-to-wishlist-button-submit")
	WebElement wishList;
	@FindBy(xpath = "//a[contains(text(),\"Apple iPhone 11 Pro (256GB) - Midnight Green\")]")
	WebElement wishListItem;

	// Initializing the Page Objects:
	public SearchedProductPage() {
		PageFactory.initElements(driver, this);
	}

	// this method is used to verify the product
	public boolean verifyProduct() {
		return productTitle.isDisplayed();
	}

	// this method is used to click on Wishlistbutton
	public void clickOnWishList() {
		wishList.click();
	}

	// this method is used to verify Wishlisteditem
	public boolean verifyWishListItem() {
		return wishListItem.isDisplayed();
	}

}
