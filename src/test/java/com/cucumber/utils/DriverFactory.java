package com.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	WebDriver driver;
	private ScenarioContext context;
	
	public DriverFactory(ScenarioContext context){
		this.context=context;
	}
	
	public WebDriver init(String browser) {
		
		System.out.println("Initializing Browser :"+ browser);
		
		if(browser.equalsIgnoreCase("Chrome")) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		context.setDriver(driver);
		
		return driver;
	}
	
	public void tearDown(WebDriver driver) {
		this.driver=driver;
		driver.quit();
	}

}
