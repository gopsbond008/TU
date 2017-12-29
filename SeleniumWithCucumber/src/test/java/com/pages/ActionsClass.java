package com.pages;

import com.cucumberrunner.PageObjectRepo;
import org.openqa.selenium.By;

public class ActionsClass extends PageObjectRepo{

    public void clickElement(By element){
        driver.findElement(element).click();
    }
    public void sendElement(By element, String keysToSend){
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(keysToSend);
    }
    public void clickElements(By element, int index){
        driver.findElements(element).get(index).click();
    }
    public String getText(By element){
        return driver.findElement(element).getText();
    }
    public void getSize(By element){
        driver.findElement(element).getSize();
    }
}
