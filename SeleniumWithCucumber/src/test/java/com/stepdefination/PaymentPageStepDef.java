package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.When;

public class PaymentPageStepDef extends PageObjectRepo {

    @When("^I go to payment page$")
    public void i_go_to_payment_page() throws Throwable {
        paymentPage.verifyPaymentPage();

        }


    @When("^I enter payment details and proceed$")
    public void i_enter_payment_details_and_proceed() throws Throwable {
        paymentPage.paymentDetails();
        paymentPage.continueToOrderConfirmationPage();


    }
}
