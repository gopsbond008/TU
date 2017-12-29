package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;


public class LoginPage  extends PageObjectRepo {

    private static By LOGIN_LINK = By.cssSelector("a[href*='login']");
    private static By LOGIN_EMAIL_TEXTBOX = By.cssSelector("#j_username");
    private static By LOGIN_PASSWORD_TEXTBOX = By.cssSelector("#j_password");
    private static By LOGIN_BUTTON = By.cssSelector(".loginButtonMain");
    private static By Greeting = By.cssSelector(".logged_in");

    public void goToLoginPageAndVarify(){
        action.clickElement(LOGIN_LINK);
        Assert.assertEquals("Login | Tu clothing", driver.getTitle());

    }
    public void loginWithValidDetailsAndVerify(String loginID, String loginPassword){
        action.sendElement(LOGIN_EMAIL_TEXTBOX, loginID);
        action.sendElement(LOGIN_PASSWORD_TEXTBOX, loginPassword);
        action.clickElement(LOGIN_BUTTON);
    }

    public void verifyLoginSuccessfulPage(){
        Assert.assertEquals("Hello Sainsbury Clothing",action.getText(Greeting));
    }

}
