package com.cucumber.selenium.concepts;

import org.openqa.selenium.WebDriver;

import com.cucumber.utils.DriverFactory;
import com.cucumber.utils.ScenarioContext;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDefs {
	
	private ScenarioContext context;
	
	public CommonStepDefs(ScenarioContext context){
		this.context=context;
	}

	@Given("Login to the site {string}")
	public void login_to_the_site(String string) {
		DriverFactory factory = new DriverFactory(context);
	    WebDriver driver = factory.init("chrome");
	    context.setDriver(driver);
	    driver.get(string);
	}
	
	@Then("Close Driver")
	public void close_driver() {
		System.out.println("Inside Close Driver");
	    DriverFactory factory = new DriverFactory(context);
	    factory.tearDown(context.getDriver());
	}


}
