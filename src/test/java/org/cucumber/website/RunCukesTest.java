package org.cucumber.website;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by z608174 on 25/10/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber-htmlreport","json: cucumber-html-reports/cucumber.json"},
                 features="src/test/resources",
                 glue= "org.cucumber.website.step")

public class RunCukesTest {
}
