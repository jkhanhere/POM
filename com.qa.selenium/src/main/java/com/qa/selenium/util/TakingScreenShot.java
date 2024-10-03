package com.qa.selenium.util;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.qa.selenium.base.base;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class TakingScreenShot extends base  
{
	
	
	
	public TakingScreenShot() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	File scr = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	{
	try 
	{
        FileUtils.copyFile(scr, new File("C:\\Users\\jafar\\eclipse-workspace\\com.qa.selenium\\SS\\homePageScreenshot.png"));
    } catch (IOException e) 
	{
        System.out.println(e.getMessage());
    }
	}

}
