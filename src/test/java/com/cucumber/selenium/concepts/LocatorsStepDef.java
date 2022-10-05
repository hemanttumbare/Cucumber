package com.cucumber.selenium.concepts;

import com.cucumber.utils.ScenarioContext;

import io.cucumber.java.en.When;

public class LocatorsStepDef {

	private ScenarioContext context;

	public LocatorsStepDef(ScenarioContext context) {
		this.context = context;
	}

	@When("Locate elements by {string}")
	public void locate_elements_by(String locator) {
		System.out.println("Locator is :" + locator);
	}

}
