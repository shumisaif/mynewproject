package com.ca.basepage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperClass {

	
	public static Properties prop;
	public static WebDriver driver;
	
	
	public static void initialization () {
	//System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		//WebDriver driver = new ChromeDriver();
		
	String browserName = prop.getProperty("Browser");
	if (browserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("mac") );
		WebDriver driver = new ChromeDriver();
			
	}
	else if (browserName.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("windows") );
		WebDriver driver = new ChromeDriver();
			
	}
	
	
	
	
	
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		
		

}
}