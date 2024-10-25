package com.swaglabs.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compras_app.feature",
        glue = "com.swaglabs.app.stepdenitions",
        snippets = SnippetType.CAMELCASE
)

public class ComprasRunner {
}
