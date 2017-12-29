package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyAccountPage extends PageObjectRepo {
    private static By MY_ACCOUNT_LINK = By.cssSelector("a[href*='my-account']");
    private static By MyAccountBanner = By.cssSelector(".feature-banner-text h2");
    public void goToMyAccountPageAndVerify(){
        action.clickElement(MY_ACCOUNT_LINK);
        Assert.assertEquals("Welcome to my account,",action.getText(MyAccountBanner));

    }
}
