package com.qa.selenium.pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.selenium.base.base;

public class HomePage extends base {

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="//a[@href='https://ui.cogmento.com/register/']")
	WebElement startHereButton;
	
	public String pageTitle()
	{
		return dr.getTitle();
	}
	
	public Login signIn() throws IOException
	{
		startHereButton.click();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return new Login();
	}
	
	

	
	
}
