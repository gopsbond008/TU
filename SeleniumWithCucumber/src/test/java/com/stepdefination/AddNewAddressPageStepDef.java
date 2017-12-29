package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class AddNewAddressPageStepDef extends PageObjectRepo{


    @Given("^I select address book link$")
    public void i_select_address_book_link() throws Throwable {

        addressBookPage.goToAddressBookPageAndVerify();


    }
    @And("^I add new address  \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void i_add_new_address(String title, String firstname, String lastname, String houseno, String postcode) throws Throwable {
        addressBookPage.addNewAddress(title,firstname,lastname,houseno,postcode);
    }
    @Then("^I should see add new address confirmation page$")
    public void i_should_see_add_new_address_confirmation_page() throws Throwable {
        addressBookPage.verifyAddNewAddress();

    }

}
