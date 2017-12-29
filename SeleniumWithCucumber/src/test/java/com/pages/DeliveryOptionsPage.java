package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DeliveryOptionsPage extends PageObjectRepo {
    private static By CHECKOUT_BUTTON_BASKET = By.cssSelector("#basketButtonTop");
    private static By LOGIN_EMAIL_TEXTBOX = By.cssSelector("#j_username");
    private static By LOGIN_PASSWORD_TEXTBOX = By.cssSelector("#j_password");
    private static By LOGIN_BUTTON = By.cssSelector(".loginButtonMain");
    private static By HOME_DELIVERY_CHECKBOX = By.cssSelector("label[for='HOME_DELIVERY']");
    private static By CLICK_COLLECT_CHECKBOX = By.cssSelector("label[for='CLICK_AND_COLLECT']");
    private static By DELIVERY_OPTION_CONTINUE_BUTTON = By.cssSelector(".button");
    private static By SELECT_DELIVERY_ADDRESS_BUTTON = By.cssSelector(".customer-options--cta");

    public void verifyDeliveryOptionPage(){
        systemLib.waitForSeconds();
        Assert.assertTrue(driver.getTitle().equals("Checkout | Tu clothing"));
    }
    public void loginAndVerifyDeliveryOptionPage(String loginID, String loginPassword){
        action.clickElement(CHECKOUT_BUTTON_BASKET);
        if(driver.getTitle().equals("Proceed to Checkout | Tu clothing")){
            action.sendElement(LOGIN_EMAIL_TEXTBOX, loginID);
            action.sendElement(LOGIN_PASSWORD_TEXTBOX, loginPassword);
            action.clickElement(LOGIN_BUTTON);
        }
        Assert.assertTrue(driver.getTitle().equals("Checkout | Tu clothing"));
    }
    public void selectHomeDelivery(){
        action.clickElement(HOME_DELIVERY_CHECKBOX);
    }
    public void selectClickAndCollect(){
        action.clickElement(CLICK_COLLECT_CHECKBOX);
    }
    public void deliveryOptionContinue(){
        action.clickElement(DELIVERY_OPTION_CONTINUE_BUTTON);
    }
    public void selectDeliveryAddress(){
        action.clickElement(SELECT_DELIVERY_ADDRESS_BUTTON);
    }

}
