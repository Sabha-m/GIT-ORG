package com.org.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public static WebDriver  driver;
	
	
public static void property() {
	
	System.setProperty("webdriver.chrome.driver","C:/Users/91807/Desktop/driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	ChromeOptions c = new ChromeOptions();
	c.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(c);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
	
}
