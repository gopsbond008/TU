package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddNewAddressPage extends PageObjectRepo {
    private static By ADDRESSBOOK_LINK = By.cssSelector("a[href*='address-book']");
    private static By VerifyAddressBookPage = By.cssSelector(".item_container_holder .title_holder h2");
    private static By ADD_ADDRESS_BUTTON = By.cssSelector("a[href*='add-address']");
    private static By ADD_ADDRESS_TITLE = By.cssSelector("select[name='titleCode']");
    private static By ADD_ADDRESS_FIRSTNAME_TEXTBOX = By.cssSelector("input[name='firstName']");
    private static By ADD_ADDRESS_LASTNAME_TEXTBOX = By.cssSelector("input[name='lastName']");
    private static By HOUSENO_TEXTBOX = By.cssSelector("input[name='houseNameOrNumber']");
    private static By POSTCODE_TEXTBOX = By.cssSelector("input[name='postcode']");
    private static By FIND_ADDRESS_BUTTON = By.cssSelector(".secondaryButton");
    private static By SELECT_ADDRESS_DROPDOWN = By.cssSelector("#addressListView");
    private static By CONFIRM_ADD_NEW_ADDRESS_BUTTON = By.cssSelector(".change_address_button");
    private static By addressConfirmationPage = By.cssSelector(".information_message span");

    public void goToAddressBookPageAndVerify(){
        action.clickElement(ADDRESSBOOK_LINK);
        Assert.assertEquals("Manage my address book",action.getText(VerifyAddressBookPage));

    }
    public void addNewAddress(String title, String firstName, String lastName, String houseNo, String postCode){
        action.clickElement(ADD_ADDRESS_BUTTON);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement SelectTitle = driver.findElement(ADD_ADDRESS_TITLE);
        SelectTitle.sendKeys(title);
        action.sendElement(ADD_ADDRESS_FIRSTNAME_TEXTBOX, firstName);
        action.sendElement(ADD_ADDRESS_LASTNAME_TEXTBOX, lastName);
        action.sendElement(HOUSENO_TEXTBOX, houseNo);
        action.sendElement(POSTCODE_TEXTBOX, postCode);
        action.clickElement(FIND_ADDRESS_BUTTON);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select SelectAddress = new Select(driver.findElement(SELECT_ADDRESS_DROPDOWN));
        SelectAddress.selectByIndex(4);
        action.sendElement(HOUSENO_TEXTBOX, houseNo);
        action.clickElement(CONFIRM_ADD_NEW_ADDRESS_BUTTON);
        }
    public void verifyAddNewAddress(){
        String AddressConfirmation = action.getText(addressConfirmationPage);
        Assert.assertTrue(AddressConfirmation.contains("Your address was created."));
    }
}
