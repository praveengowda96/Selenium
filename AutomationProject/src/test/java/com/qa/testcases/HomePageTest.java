package com.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SearchedProductPage;
import com.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	SearchedProductPage searchedProductPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
//		loginpage = new LoginPage();
//		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void searchAndSelectProduct() {
		homepage =new HomePage();
		testutil = new TestUtil();
		homepage.serachProduct();
		homepage.clickOnProduct();	
		testutil.swithchTab();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
