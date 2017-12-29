package com.stepdefination;

import com.cucumberrunner.GlobalHooks;
import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.Given;

public class CommonStepDef extends PageObjectRepo {
    @Given("^I Navigate to LogIn Page$")
    public void i_navigate_to_login_page() throws Throwable {
        loginPage.goToLoginPageAndVarify();
    }
}
