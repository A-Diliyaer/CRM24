package com.CRM24.runners.base_navigation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/CRM24/step_definitions",
        features = "src/test/resources/features/base_navigation",
        dryRun = false,
        strict = false,
        tags = "@ClockInFull",
        plugin = {
                "html:target/cucumber-html-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }

)

public class BaseNavigationRunner {
}
