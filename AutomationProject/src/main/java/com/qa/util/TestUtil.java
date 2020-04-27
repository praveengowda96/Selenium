package com.qa.util;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.JavascriptExecutor;

import com.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long Page_Load_Timeout = 20;
	public static long Implicit_Wait = 10;

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;
	// this is used to switch the frame 
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	// this method is used Switch the tab
	public void swithchTab() {
		String oldTab = driver.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
		newTab.remove(oldTab);
		driver.switchTo().window(newTab.get(0));
	}
}
