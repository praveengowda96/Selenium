package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	@FindBy(xpath = "//span[contains(text(),\"Hello. Sign in\")]")
	WebElement loginBtn;

	@FindBy(id = "ap_email")
	WebElement userName;

	@FindBy(xpath = "//input[@class=\"a-button-input\"]")
	WebElement continuebtn;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(xpath = "//input[@id=\"signInSubmit\"]")
	WebElement Signin;

	@FindBy(xpath = "//a[contains(text(),\"Mobiles\")]")
	WebElement mobileBtn;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// this method is used login
	public HomePage login(String un, String pwd) {
		loginBtn.click();
		userName.sendKeys(un);
		continuebtn.click();
		password.sendKeys(pwd);
		Signin.click();
		return new HomePage();

	}

	public void clickonMob() {
		mobileBtn.click();
	}
}