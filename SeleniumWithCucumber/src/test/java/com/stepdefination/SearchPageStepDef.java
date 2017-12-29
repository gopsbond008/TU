package com.stepdefination;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class SearchPageStepDef extends PageObjectRepo {

    @Given("^I search for the product \"([^\"]*)\"$")
    public void i_search_for_the_product(String serachTerm) throws Throwable {
        searchPage.searchForTheProducts(serachTerm);
    }

    @Then("^I should see \"([^\"]*)\" in search result page$")
    public void i_should_see_products_in_search_result_page(String serachTerm) throws Throwable {
        searchPage.verifySearchResults(serachTerm);

    }


}
