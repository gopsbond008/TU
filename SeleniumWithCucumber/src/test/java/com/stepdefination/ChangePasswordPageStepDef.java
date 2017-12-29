package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class ChangePasswordPageStepDef extends PageObjectRepo {

    @Given("^I select change password link$")
    public void i_select_change_password_link() throws Throwable {
        changePasswordPage.goToChangePasswordPageAndVerify();

    }
    @And("^I enter old \"([^\"]*)\" new \"([^\"]*)\" and confirm \"([^\"]*)\" to change password$")
    public void i_enter_old_something_new_something_and_confirm_something_to_change_password(String oldPassword, String newPassword, String confirmPassword) throws Throwable {
        changePasswordPage.changePassword(oldPassword, newPassword, confirmPassword);
    }


//    @When("^I enter old, new and confirm password to change password$")
//    public void i_enter_old_new_and_confirm_password_to_change_password(DataTable passwordTable) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        String password;
//        Map<String, String> changePassword=passwordTable.asMap(String.class,String.class);
//        password= changePassword.get("OldPassword");
//        password= changePassword.get("NewPassword");
//
//
//    }

    @Then("^I should see change password confirmation page$")
    public void i_should_see_change_password_confirmation_page() throws Throwable {
        changePasswordPage.verifyChangePassword();

    }

}
