package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CheckOutBillingAddressPage extends PageObjectRepo {
    private static By checkOutBillingAddressPage = By.cssSelector(".checkout-summary-total");
    private static By EXISTING_BILLING_ADDRESS_CHECKBOX = By.cssSelector("label[for='existingAddressChosen1']");
    private static By CHECKOUT_SELECT_ADDRESS_DROPDOWN = By.cssSelector("#existingAddressId");
    private static By ACCEPT_TERMS_AND_CONDITIONS = By.cssSelector("#termsAndConditionsId");
    private static By CONTINUE_TO_PAYMENT_PAGE_BUTTON = By.cssSelector("#contPayment");


    public void verifyCheckOutBillingAddressPage(){
        Assert.assertTrue(action.getText(checkOutBillingAddressPage).contains("Order total"));

    }
    public void selectExistingBillingAddress(){
        action.clickElement(EXISTING_BILLING_ADDRESS_CHECKBOX);
        Select SelectAddressFromDropdown = new Select(driver.findElement(CHECKOUT_SELECT_ADDRESS_DROPDOWN));
        SelectAddressFromDropdown.selectByIndex(1);

    }
    public void checkoutAddNewBillingAddress(){
        //to be implemented
    }
    public void acceptTermsAndCondition(){
        action.clickElement(ACCEPT_TERMS_AND_CONDITIONS);
    }
    public void continueToPaymentPage(){
        action.clickElement(CONTINUE_TO_PAYMENT_PAGE_BUTTON);
    }
}