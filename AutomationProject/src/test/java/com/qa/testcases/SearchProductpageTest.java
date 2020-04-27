package com.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SearchedProductPage;
import com.qa.util.TestUtil;

public class SearchProductpageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	TestUtil testutil;
	SearchedProductPage searchproductPage;
	public SearchProductpageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		intialization();
//		loginpage = new LoginPage();
//		homepage =loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void searchAndSelectProduct() {
		homepage =new HomePage();
		searchproductPage =new SearchedProductPage();
		testutil = new TestUtil();
		homepage.serachProduct();
		homepage.clickOnProduct();	
		testutil.swithchTab();
	    searchproductPage.verifyProduct();
	    searchproductPage.clickOnWishList(); 
	    searchproductPage.verifyWishListItem();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


}
