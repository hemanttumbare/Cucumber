package com.cucumber.hooks;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	
	private static final Logger logger = LogManager.getLogger(Hooks.class);

	@Before
	public void beforeScenario(Scenario scenario) {
		logger.info("Starting Scenario "+scenario.getName());
		
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		logger.info("Scenario Status :"+scenario.getStatus());
	}

}
