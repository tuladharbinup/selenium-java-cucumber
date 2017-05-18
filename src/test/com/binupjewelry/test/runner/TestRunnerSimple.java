package com.binupjewelry.test.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Binup on 5/16/2017.
 */

@CucumberOptions(features = {"src/test/com/binupjewelry/test/features/"},
        glue = {"com/binupjewelry/test/steps"}, plugin = {"pretty", "html:target/cucumber-html-report" })
public class TestRunnerSimple extends AbstractTestNGCucumberTests {
}
