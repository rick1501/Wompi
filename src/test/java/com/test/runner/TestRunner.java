package com.test.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registerUser.feature",
        glue = "com.test.stepDefnitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {
}
