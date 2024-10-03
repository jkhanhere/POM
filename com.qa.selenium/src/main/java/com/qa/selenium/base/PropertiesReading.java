package com.qa.selenium.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReading {
	
	public static void main(String args[]) throws IOException
	{
		String filePath = "./src/main/java/com/qa/selenium/config/config.properties";
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(filePath);
		
		
		prop.load(ip);
		
		String URL;
		
		URL = prop.getProperty("url");
		System.out.println("*****"+URL);
	}

}
