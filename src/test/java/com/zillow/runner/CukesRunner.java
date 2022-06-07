package com.zillow.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                //    "json:target/cucumber.json",
        },
        features = "src/test/resources/features",
        glue = "com/zillow/step_definitions",
        dryRun = true,
        tags = "@wip",
        publish = false

)
public class CukesRunner {
}
