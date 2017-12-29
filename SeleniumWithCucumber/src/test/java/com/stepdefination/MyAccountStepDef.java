package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.When;

public class MyAccountStepDef extends PageObjectRepo {

    @When("^I navigate to my account page$")
    public void i_navigate_to_my_account_page() throws Throwable {
        myAccountPage.goToMyAccountPageAndVerify();

    }

}
