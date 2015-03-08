package com.epam.mp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTest {
	public static void main(String[] args){
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.gismeteo.by/weather-karaganda-5168/");
		System.out.println (wd.getTitle());
		wd.quit();
	}	
}
