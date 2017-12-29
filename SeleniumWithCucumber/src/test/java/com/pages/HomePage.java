package com.pages;

import com.cucumberrunner.PageObjectRepo;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage extends PageObjectRepo {


    private static String BASE_URL = "https://tuclothing.sainsburys.co.uk/";
    private static By Cookie = By.cssSelector(".cookieClose");

    public void navigateToHomepage(){
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(BASE_URL);
        driver.manage().window().maximize();
        Assert.assertTrue("No Cookie Displayed", driver.findElement(Cookie).isDisplayed());
        action.clickElement(Cookie);

    }

}
