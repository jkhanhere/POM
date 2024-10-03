package com.qa.selenium.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.selenium.base.base;
import com.qa.selenium.pages.HomePage;

public class HomePageTest extends base {
	
	HomePage hp;
	
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		hp = new HomePage();
		//hp.signIn();
			
	}
	
	@Test (priority=1)
	public void pageTitle()
	{
		String title = hp.pageTitle();
		assertEquals(title, prop.getProperty("HomePage_Title"));
		
	}
	
	
	@AfterMethod
	public void closeDriver()
	{
		dr.quit();
	}
	
	
	
}
