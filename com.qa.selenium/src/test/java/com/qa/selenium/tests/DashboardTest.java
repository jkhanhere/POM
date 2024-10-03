package com.qa.selenium.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.selenium.base.base;
import com.qa.selenium.pages.Dashboard;
import com.qa.selenium.pages.Login;

public class DashboardTest extends base {
	
	Dashboard db;
	Login lp;

	public DashboardTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		db = new Dashboard();	
		lp = new Login();
		lp.enteringToSigin();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
			
	}
	
	@Test
	public void pageTitle()
	{
		String title = db.pageTitle();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		assertEquals(title, prop.getProperty("Dashboard_Title"));
		
	}
	
	@AfterMethod
	public void quitDriver()
	{
		dr.quit();
	}

}
