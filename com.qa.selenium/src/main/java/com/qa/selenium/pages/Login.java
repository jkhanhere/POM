package com.qa.selenium.pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.selenium.base.base;

public class Login extends base{

	public Login() throws IOException {
		super();
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(xpath="//a[@href='https://ui.cogmento.com/register/']")
	WebElement startHereButton;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	
	
	public String pageTitle()
	{
		
		return dr.getTitle();
	}
	
	
	
	public Dashboard login(String un, String pwd) throws IOException
	{
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new Dashboard();
	}
	
	
	public Login enteringToSigin() throws IOException
	{
		startHereButton.click();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		return new Login();
		
		
	}

}
