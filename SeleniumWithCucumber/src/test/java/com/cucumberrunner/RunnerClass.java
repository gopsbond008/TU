package com.cucumberrunner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/featurefiles",
        glue = { "com.stepdefination" },
//        tags={"@EJ-456"},
        tags={"@Address-New"},
        plugin = {"html:target/cucumber-html-report","json:target/cucumber.json"}
)

public class RunnerClass {
}
