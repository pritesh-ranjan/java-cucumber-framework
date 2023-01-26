package org.framework.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        plugin = {
                "json:target/cucumber-report.json",
                "html:target/cucumber-reports/report.html"},
        glue = {"org.framework.bdd.steps"},
//        tags = "@get",
        dryRun = false)
public class TestRunner {
}
