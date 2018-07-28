package TestCase.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./Features/"},glue= { "./TestCase.Glue/"}, monochrome = true,
	plugin = {"pretty","html:target/cucumber_report","json:target/cucumber.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"})
public class Extend_Report_Runner {

}
