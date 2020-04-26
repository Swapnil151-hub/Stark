package Stark;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Feature5.feature",
glue="Arya",
tags= {"~@search"},
plugin= {"html:target/htmlreport",
		"json:target/jasonreport.jso",
		"junit:target/xmlreport.xml"
})


public class runner extends AbstractTestNGCucumberTests {

}