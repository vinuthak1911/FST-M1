package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
		glue = {"stepDefinitions"},
		tags = "@activity2",
		publish = true,
		plugin = {
				"pretty",
				"html:src/reports/HTML_Report.html",
				"json:src/reports/json-report.json",
				"junit:src/reports/XML_Report.xml"
		}
		
		)

public class TestRunner_Activity2 {
	//Empty

}
