package com.mustafa_sprint2.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",
        glue = "com/mustafa_sprint2/step_definitions",
        dryRun = false,
        tags = "@LinkInMessage",
        publish = true //generating a report with public link
)
public class CukesRunner {}


