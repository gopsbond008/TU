package com.stepdefination;

import com.cucumberrunner.GlobalHooks;
import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.Given;
import org.junit.Assert;

public class HomePageStepDef extends PageObjectRepo {
    @Given("^I am on homepage$")
    public void i_am_on_homepage() throws Throwable {
        Assert.assertEquals("Tu clothing", driver.getTitle());
    }
}
