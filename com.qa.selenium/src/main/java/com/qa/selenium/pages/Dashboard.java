package com.qa.selenium.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.qa.selenium.base.base;

public class Dashboard extends base {

	public Dashboard() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr, this);
	}
	
	public String pageTitle()
	{
		return dr.getTitle();
	}

}
