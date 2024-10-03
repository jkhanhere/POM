package com.qa.selenium.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.selenium.base.base;
import com.qa.selenium.pages.Dashboard;
import com.qa.selenium.pages.HomePage;
import com.qa.selenium.pages.Login;

public class LoginTest extends base{
	
	Login lp;
	Dashboard db;

	public LoginTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		lp = new Login();
		lp.enteringToSigin();
		
		
			
	}
	
	@Test(priority=1)
	public void pageTitle() throws IOException
	{
		
		
		String title = lp.pageTitle();
		assertEquals(title, prop.getProperty("LoginPage_Title"));
		
	}
	
	@Test(priority=2)
	public void signIn() throws IOException
	{
		
		db = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		String title = lp.pageTitle();
		assertEquals(title, prop.getProperty("Dashboard_Title"));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	@AfterMethod
	public void closeDriver()
	{
		dr.quit();
	}

}
