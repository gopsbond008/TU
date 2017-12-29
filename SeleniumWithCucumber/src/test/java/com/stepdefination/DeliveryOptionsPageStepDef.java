package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.When;

public class DeliveryOptionsPageStepDef extends PageObjectRepo {


    @When("^I go to Delivery page$")
    public void i_go_to_Delivery_page() throws Throwable {
        deliveryOptionsPage.verifyDeliveryOptionPage();



    }
}
