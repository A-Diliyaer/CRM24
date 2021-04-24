package com.CRM24.runners.Activity_stream;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/CRM24/step_definitions",
        features = "src/test/resources/features/activity_stream/microblog/MessageTab.feature",
        dryRun = false,
        strict = false,
        tags = "",
        plugin = {
                "html:target/cucumber-html-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }

)
public class MessageTabRunner {

        //for testNG extend AbstractTestNGCucumberTESTS
        //testng.xml -
}
