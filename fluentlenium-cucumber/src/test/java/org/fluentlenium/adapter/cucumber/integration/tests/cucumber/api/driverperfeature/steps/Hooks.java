package org.fluentlenium.adapter.cucumber.integration.tests.cucumber.api.driverperfeature.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseTest {

    @Before
    public void beforeScenario(Scenario scenario) {
        this.before(scenario);
    }

    @After
    public void afterScenario(Scenario scenario) {
        this.after(scenario);
    }
}
