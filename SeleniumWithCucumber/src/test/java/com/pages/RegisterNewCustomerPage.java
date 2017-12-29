package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterNewCustomerPage extends PageObjectRepo {
    private static By REGISTER_BUTTON  = By.cssSelector(".regToggle");
    private static By verifyRegisterPage  = By.cssSelector(".registerFormHolder h2");
    private static By EMAIL_TEXTBOX = By.cssSelector("#register_email");
    private static By TITLE_DROPDOWN = By.cssSelector("#register_title");
    private static By FIRSTNAME_TEXTBOX = By.cssSelector("#register_firstName");
    private static By LASTNAME_TEXTBOX = By.cssSelector("#register_lastName");
    private static By PASSWORD_TEXTBOX = By.cssSelector("#password");
    private static By CONFIRM_PASSWORD_TEXTBOX = By.cssSelector("#register_checkPwd");
    private static By TERMS_CHECKBOX = By.cssSelector("input[name='termsAndConditions']");
    private static By REGISTER_COMPLETE_BUTTON = By.cssSelector(".registerButton");
    private static By verifyRegistrationConfirmationPage  = By.cssSelector(".content-container h2");
    public void goToRegisterNewCustomerPageAndVerify(){
        action.clickElement(REGISTER_BUTTON);
        Assert.assertEquals("Register with Tu",action.getText(verifyRegisterPage));
    }

    public void registerNewCustomerWithValidDetails(String email, String title, String firstname, String lastname, String password, String confirmpassword){
        action.sendElement(EMAIL_TEXTBOX, email);
        Select Title = new Select(driver.findElement(TITLE_DROPDOWN));
        Title.selectByVisibleText(title);
        action.sendElement(FIRSTNAME_TEXTBOX, firstname);
        action.sendElement(LASTNAME_TEXTBOX, lastname);
        action.sendElement(PASSWORD_TEXTBOX, password);
        action.sendElement(CONFIRM_PASSWORD_TEXTBOX, confirmpassword);
        action.clickElement(TERMS_CHECKBOX);
        action.clickElement(REGISTER_COMPLETE_BUTTON);
        systemLib.waitForSeconds();


    }
    public void verifyRegistrationConfirmationPage(){
        Assert.assertEquals("Thank you for registering with Tu",action.getText(verifyRegistrationConfirmationPage));

    }

}
