package com.epam.mp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Designed for FF36
public class GetTitleApp {
	public static void main(String[] args){
		System.out.println("I just started my execution!"); //Output message to console
	}
	
	public String getGismeteoTitle(){
		WebDriver wd = new FirefoxDriver(); //Initialization profile for FireFox browser
		wd.get("http://www.gismeteo.by/weather-karaganda-5168/"); //Loading new web page
		String pageTitle = wd.getTitle(); //Initialization variable pageTitle by the title of the opened page.
		wd.quit(); //Closing opened page
		return pageTitle; //Return title of the page
		/*Commit from Eclipse*/
	}
}