package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",

                "html:target/reports/html/html_reports.html",
                "monochrome : true, // Display the console output in a readable format",
                "json:target/reports/json/json-reports/cucumber.json",
                "junit:target/reports/xml/xml-report/cucumber.xml",
                "rerun:target/reports/rerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        },
        features = "src/test/resources/features", // Path to feature files
        glue = "stepDefinitions",
        dryRun = false, // Set to true to check if the mappings are correct without executing
        tags = "@smoke" // Specify which tags to run (can adjust as needed)

)

public class CukesRunner {
}