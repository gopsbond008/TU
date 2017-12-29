package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailsPage extends PageObjectRepo {

    private static By verifyProductDetailsPage = By.cssSelector(".backToSearch");
    private static By ADDTOBASKET_BUTTON = By.cssSelector(".jsonBackInStockMessage");
    private static By SIZE_DROPDOWN = By.cssSelector("#Size");
    private static By SIZE_ERROR_MESSAGE = By.cssSelector(".pdp-add-to-cart-error-message");

    public void verifyProductDetailsPage(){
        Assert.assertEquals("Back to Search Results",action.getText(verifyProductDetailsPage));
    }
    public void addProductToBasketAndVerify(){
        Select SelectSize = new Select(driver.findElement(SIZE_DROPDOWN));
        SelectSize.selectByIndex(5);
        action.clickElement(ADDTOBASKET_BUTTON);
        systemLib.waitForSeconds();
        if(SIZE_ERROR_MESSAGE.equals("Please choose a size")){
            SelectSize.selectByIndex(6);
            action.clickElement(ADDTOBASKET_BUTTON);        }
        Assert.assertEquals("Item added to basket", action.getText(By.cssSelector(".cart-updated h3")));
    }
}


