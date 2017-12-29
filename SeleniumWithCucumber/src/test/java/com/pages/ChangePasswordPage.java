package com.pages;


import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ChangePasswordPage extends PageObjectRepo {

    private static By CHANGE_PASSWORD_LINK = By.cssSelector("a[href*='update-password'");
    private static By verifyChangePasswordPage = By.cssSelector(".item_container_holder .title_holder h2");
    private static By CURRENT_PASSWORD_TEXTBOX = By.cssSelector("input[name='currentPassword']");
    private static By NEW_PASSWORD_TEXTBOX = By.cssSelector("input[name='newPassword']");
    private static By CONFIRM_PASSWORD_TEXTBOX = By.cssSelector("input[name='checkNewPassword']");
    private static By CONFIRM_CHANGE_PASSWORD_BUTTON = By.cssSelector(".form");
    private static By verifyPasswordChangedConfirmationPage = By.cssSelector("#content h2");

    public void goToChangePasswordPageAndVerify(){
        action.clickElement(CHANGE_PASSWORD_LINK);
        Assert.assertEquals("Change my password", action.getText(verifyChangePasswordPage));

    }

    public void changePassword(String oldPassword, String newPassword, String confirmPassword) {
        action.sendElement(CURRENT_PASSWORD_TEXTBOX,oldPassword);
        action.sendElement(NEW_PASSWORD_TEXTBOX,newPassword);
        action.sendElement(CONFIRM_PASSWORD_TEXTBOX,confirmPassword);
        action.clickElement(CONFIRM_CHANGE_PASSWORD_BUTTON);

    }
    public void verifyChangePassword(){
        Assert.assertEquals("Your password has been changed", action.getText(verifyPasswordChangedConfirmationPage));

    }




}
