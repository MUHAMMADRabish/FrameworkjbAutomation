package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		plugin = { 
				   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				   "html:target/HtmlReports/cucumber-html-report.html",
		           "json:target/JsonReports/cucumber-json-report.json", 
		           "junit:target/JunitReports/cucumber-junit-report.xml" 
		         },
		features = {"src/test/java/feature/Dockets.feature"},
		glue={"stepdefinition"},
		tags = "@test_7"
		)

public class CucumberRunner {

}