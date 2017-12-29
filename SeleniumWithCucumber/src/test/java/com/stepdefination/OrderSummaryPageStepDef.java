package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class OrderSummaryPageStepDef extends PageObjectRepo {



    @And("^I review the order in order summary page$")
    public void i_review_the_order_in_order_summary_page() throws Throwable {
        orderSummaryPage.verifyOrderSummaryPage();
        orderSummaryPage.orderSummaryContinue();

    }

    @And("^I select billing address and terms and condition$")
    public void i_select_billing_address_and_terms_and_condition() throws Throwable {
        checkOutBillingAddressPage.verifyCheckOutBillingAddressPage();
        checkOutBillingAddressPage.selectExistingBillingAddress();
        checkOutBillingAddressPage.acceptTermsAndCondition();
        checkOutBillingAddressPage.continueToPaymentPage();

    }
}
