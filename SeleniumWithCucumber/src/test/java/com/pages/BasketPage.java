package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPage extends PageObjectRepo {
    private static By GO_TO_BASKET_BUTTON = By.cssSelector(".doCheckoutBut");
    private static By CHECKOUT_BUTTON_BASKET = By.cssSelector("#basketButtonTop");


    public void verifyBasketPage(){
        action.clickElement(GO_TO_BASKET_BUTTON);
        Assert.assertTrue(driver.getTitle().equals("Your shopping bag | Tu clothing"));

    }
    public void continueCheckout(){
       action.clickElement(CHECKOUT_BUTTON_BASKET);

    }
}
