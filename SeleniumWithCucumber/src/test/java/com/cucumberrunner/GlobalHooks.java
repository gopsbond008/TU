package com.cucumberrunner;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class GlobalHooks extends PageObjectRepo  {
  //  public static WebDriver driver;

    @Before
    public void beforeScenario(){
        homePage.navigateToHomepage();
    }

    @After
    public void afterScenario(){
      //  driver.close();

    }

}
