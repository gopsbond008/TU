package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.Given;


public class ProductPageStepDef extends PageObjectRepo {

    @Given("^I add a product to basket$")
    public void i_add_a_product_to_basket() throws Throwable {
        searchPage.selectProduct();
        productDetailsPage.verifyProductDetailsPage();
        productDetailsPage.addProductToBasketAndVerify();
        basketPage.verifyBasketPage();
        basketPage.continueCheckout();



    }

}
