package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageStepDef extends PageObjectRepo {


    @And("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_enter_username_as_something_and_password_as_something(String loginId, String loginPassword) throws Throwable {
        loginPage.loginWithValidDetailsAndVerify(loginId, loginPassword);
    }

    @Then("^I should see Login Successfully page$")
    public void i_should_see_login_successfully_page() throws Throwable {
        loginPage.verifyLoginSuccessfulPage();

    }


}
