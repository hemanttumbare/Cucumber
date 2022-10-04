package com.cucumber.stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.en.Given;

public class TestStepDefinition {
	private static final Logger logger = LogManager.getLogger(TestStepDefinition.class);

	@Given("Test This Step")
	public void test_this_step() {
		logger.info("Hello This is first setp...!!!");
	}

}
