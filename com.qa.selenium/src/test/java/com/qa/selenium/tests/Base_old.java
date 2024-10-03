package com.qa.selenium.tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Base_old 

{
	public static void main(String args[])
	{

	WebDriver dr = new ChromeDriver();
	dr.get("https://www.amazon.in/");
	dr.manage().window().maximize();
	
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	WebElement searchbox = dr.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("Iphone 14");
	searchbox.sendKeys(Keys.TAB);
	searchbox.sendKeys(Keys.ENTER);
	
	List<WebElement> resultList = dr.findElements(By.cssSelector("[class='a-size-medium a-color-base a-text-normal']"));
	System.out.println(resultList+ "\n");
	
	System.out.println(resultList.get(2).getText());
	resultList.get(2).click();
	
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	System.out.println("The title --> "+ dr.getTitle());
	Assert.assertEquals(dr.getTitle(), "Amazon.in : Iphone 14");
	
	SoftAssert  sa = new SoftAssert();
	sa.assertEquals(dr.getTitle(), "Amazon.in : Iphone 14");
	
	
	
	}
	
	
	
}
