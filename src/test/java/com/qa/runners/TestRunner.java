package com.qa.runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",//feature direction
    glue = "com.qa.stepDefinitions",  
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml"
    },
    monochrome = true
)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel =true)  
    public Object[][] scenarios() {
        return super.scenarios();
    }
}