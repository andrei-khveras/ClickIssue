package com.epam.mp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Designed for FF36
public class GetTitleApp {
	public static void main(String[] args){
		System.out.println("I just started my execution!");
	}
	
	public String getGismeteoTitle(){
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.gismeteo.by/weather-karaganda-5168/");
		String pageTitle = wd.getTitle();
		wd.quit();
		return pageTitle;
	}
}