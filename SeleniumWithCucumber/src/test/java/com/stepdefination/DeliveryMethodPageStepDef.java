package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.When;

public class DeliveryMethodPageStepDef extends PageObjectRepo {

    @When("^I select home delivery option in delivery options page$")
    public void i_select_home_delivery_option_in_delivery_options_page() throws Throwable {
        deliveryOptionsPage.verifyDeliveryOptionPage();
        deliveryOptionsPage.selectHomeDelivery();
        deliveryOptionsPage.deliveryOptionContinue();


    }
    @When("^I select delivery address in delivery address page$")
    public void i_select_delivery_address_in_delivery_address_page() throws Throwable {
        deliveryOptionsPage.selectDeliveryAddress();
        deliveryMethodPage.verifyDeliveryMethodPage();
        deliveryMethodPage.selectStandradDelivery();
        deliveryMethodPage.deliveryOptionContinue();




    }
}
