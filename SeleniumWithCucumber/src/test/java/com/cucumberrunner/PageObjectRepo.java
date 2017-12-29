package com.cucumberrunner;

import com.libs.BusinessLib;
import com.libs.SystemLib;
import com.pages.*;
import org.openqa.selenium.WebDriver;

public class PageObjectRepo {

    public static WebDriver driver;
    public static ActionsClass action = new ActionsClass();
    public static HomePage homePage=new HomePage();
    public static SearchPage searchPage=new SearchPage();
    public static BusinessLib businessLib=new BusinessLib();
    public static ChangePasswordPage changePasswordPage = new ChangePasswordPage();
    public static SystemLib systemLib=new SystemLib();
    public static ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    public static BasketPage basketPage = new BasketPage();
    public static LoginPage loginPage = new LoginPage();
    public static MyAccountPage myAccountPage = new MyAccountPage();
    public static RegisterNewCustomerPage registerNewCustomer = new RegisterNewCustomerPage();
    public static AddNewAddressPage addressBookPage = new AddNewAddressPage();
    public static DeliveryOptionsPage deliveryOptionsPage = new DeliveryOptionsPage();
    public static DeliveryMethodPage deliveryMethodPage = new DeliveryMethodPage();
    public static OrderSummaryPage orderSummaryPage =new OrderSummaryPage();
    public static CheckOutBillingAddressPage checkOutBillingAddressPage = new CheckOutBillingAddressPage();
    public static PaymentPage paymentPage = new PaymentPage();
    public static ClickAndCollectPage clickAndCollectPage = new ClickAndCollectPage();
}
