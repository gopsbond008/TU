package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;

public class OrderSummaryPage extends PageObjectRepo{
    private static By orderSummaryPage = By.cssSelector(".checkout-summary-item-container h2");
    private static By ORDER_SUMMARY_CONTINUE_BUTTON = By.cssSelector(".button");


    public void verifyOrderSummaryPage(){

        Assert.assertEquals("Order summary",action.getText(orderSummaryPage));
    }
    public void orderSummaryContinue(){
        action.clickElement(ORDER_SUMMARY_CONTINUE_BUTTON);
    }
}
