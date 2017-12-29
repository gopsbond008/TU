package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RegisterNewCustomerStepDef extends PageObjectRepo{


    @Given("^I go to register customer page$")
    public void i_go_to_register_customer_page() throws Throwable {
        loginPage.goToLoginPageAndVarify();
        registerNewCustomer.goToRegisterNewCustomerPageAndVerify();
    }
    @And("^I register new customer \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void i_register_new_customer_something_something_something_something_something_something(String email, String title, String firstname, String lastname, String password, String confirmpassword) throws Throwable {
        registerNewCustomer.registerNewCustomerWithValidDetails(email, title,firstname,lastname,password,confirmpassword);

    }


    @Then("^I should see registration confirmation page$")
    public void i_should_see_registration_confirmation_page() throws Throwable {
        registerNewCustomer.verifyRegistrationConfirmationPage();

    }


}
