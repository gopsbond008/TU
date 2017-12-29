package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage  extends PageObjectRepo {
    private static By verifyPaymentPage = By.cssSelector(".checkout-summary-item-container h2");
    private static By CARDNUMBER_TEXTBOX = By.cssSelector("#cardNumber");
    private static By CARDHOLDER_NAME_TEXTBOX = By.cssSelector("#cardholderName");
    private static By CARDEXPIRY_MONTH = By.cssSelector("#expiryMonth");
    private static By CARDEXPIRY_YEAR = By.cssSelector("#expiryYear");
    private static By CARD_CSC_TEXTBOX = By.cssSelector("#csc");
    private static By BUYNOW_BUTTON = By.cssSelector("#btnSubmit");

    public void verifyPaymentPage(){
        systemLib.waitForSeconds();
        Assert.assertEquals("Card payment", action.getText(verifyPaymentPage));

    }
    public void paymentDetails() {
        action.sendElement(CARDNUMBER_TEXTBOX,"12345678901234567");
        action.sendElement(CARDHOLDER_NAME_TEXTBOX, "Mr Bond");
        Select ExpiryMonth = new Select(driver.findElement(CARDEXPIRY_MONTH));
        ExpiryMonth.selectByIndex(1);
        Select ExpiryYear = new Select(driver.findElement(CARDEXPIRY_YEAR));
        ExpiryYear.selectByIndex(1);
        action.sendElement(CARD_CSC_TEXTBOX,"123");

    }
    public void continueToOrderConfirmationPage(){
       // action.clickElement(BUYNOW_BUTTON);
    }
}
