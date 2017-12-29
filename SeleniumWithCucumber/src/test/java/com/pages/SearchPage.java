package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchPage extends PageObjectRepo {
    private static By SEARH_TEXTBOX = By.cssSelector("#search");
    private static By SEARH_BUTTON = By.cssSelector(".searchButton");
    private static By invalidSearchResult = By.cssSelector(".title_holder h1");
    private static By PRODUCT_LINK = By.cssSelector(".prod_grid .thumbPrimary img[src*='products']");

    public  void searchForTheProducts(String serachTerm) {
        action.sendElement(SEARH_TEXTBOX, serachTerm);
        action.clickElement(SEARH_BUTTON);


    }
    public  void verifySearchResults(String serachTerm) {

        systemLib.waitForSeconds();
        Assert.assertEquals("Search results for: "+serachTerm+" | Tu clothing", driver.getTitle());
    }

    public void selectProduct(){
       action.clickElements(PRODUCT_LINK,0);

    }



    public  void verifyNoProductsInSearchResult() {
        systemLib.waitForSeconds();
        Assert.assertEquals("Sorry, no results for 'inValidSearchTerm'", action.getText(invalidSearchResult));
    }
}
