package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Map;

public class AddToBasketStepDef extends PageObjectRepo{



    @Given("^I select product from search result page$")
    public void i_select_product_from_search_result_page() throws Throwable {
        searchPage.selectProduct();

    }

    @And("^I should see product details page$")
    public void i_should_see_product_details_page() throws Throwable {
        productDetailsPage.verifyProductDetailsPage();


    }
    @Then("^I add product to basket$")
    public void i_add_product_to_basket() throws Throwable {
        productDetailsPage.addProductToBasketAndVerify();
    }


    @When("^I add multiple products to basket via search$")
    public void i_add_multiple_products_to_basket_via_search(DataTable productTable) throws Throwable {

      String  searchWord;
        Map<String,String> searchTerm=productTable.asMap(String.class,String.class);

        searchWord= searchTerm.get("Products Code");
        searchPage.searchForTheProducts(searchWord);
        searchPage.selectProduct();
        productDetailsPage.addProductToBasketAndVerify();
        searchWord= searchTerm.get("Products Type");
        searchPage.searchForTheProducts(searchWord);
        searchPage.selectProduct();
        productDetailsPage.addProductToBasketAndVerify();
        searchWord=searchTerm.get("Products Brand");
        searchPage.searchForTheProducts(searchWord);
        searchPage.selectProduct();
        productDetailsPage.addProductToBasketAndVerify();


    }

    @Then("^I should see products in basket$")
    public void i_should_see_products_in_basket() throws Throwable {
        basketPage.verifyBasketPage();
    }


}
