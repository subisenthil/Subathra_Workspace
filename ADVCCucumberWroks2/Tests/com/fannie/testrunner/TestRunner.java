package com.fannie.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"features/com/fannie/features"},
                 glue = {"com.fannie.step"},
                 //plugin = {"pretty","html:target/cucumber-html-report"},
                 format = {"json", "json:target/cucumber-json-report"},
                 monochrome = true,
                 tags = {"@FirstDryRunTest"}
                 
                 )
public class TestRunner {
		
	}
