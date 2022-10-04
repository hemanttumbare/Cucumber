package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},
	glue = {"com.cucumber.stepDefinitions","com.cucumber.hooks"},
	tags="@test",
	plugin = { "pretty" },
	monochrome=true
	)

public class BddTest {
}
