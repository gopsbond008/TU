package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DeliveryMethodPage extends PageObjectRepo {
    private static By SELECT_STANDRAD_DELIVERY_CHECKBOX = By.cssSelector("label[for='standard-delivery']");
    private static By SELECT_PREMIUM_DELIVERY_CHECKBOX = By.cssSelector("label[for='premium-delivery']");
    private static By DELIVERY_METHOD_CONTINUE_BUTTON = By.cssSelector(".button");


    public void verifyDeliveryMethodPage(){
        Assert.assertEquals("Please choose how you’d like your order delivered.",action.getText(By.cssSelector(".checkout-content-container p")));
    }
    public void selectStandradDelivery(){
        action.clickElement(SELECT_STANDRAD_DELIVERY_CHECKBOX);
    }
    public void selectPremiumDelivery(){
        action.clickElement(SELECT_PREMIUM_DELIVERY_CHECKBOX);
    }
    public void deliveryOptionContinue(){
        action.clickElement(DELIVERY_METHOD_CONTINUE_BUTTON);
    }

}
