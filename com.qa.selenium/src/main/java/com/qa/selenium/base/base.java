package com.qa.selenium.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver dr;
	public static Properties prop;
	
	public base() throws IOException
	{
	String pathfile = "./src/main/java/com/qa/selenium/config/config.properties";
		prop = new Properties();
		FileInputStream ip = new FileInputStream(pathfile);
		prop.load(ip);
		 
	}
	
	public static void initialization()
	{
		String browsername= prop.getProperty("browser");
		if(browsername.equals("Chrome"))
		{
			dr = new ChromeDriver();
		}
		
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		//dr.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
		//dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		dr.get(prop.getProperty("url"));
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
	
	}
	
	
	
	
	
	
	
	

}
