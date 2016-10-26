package org.cucumber.website.pageojbects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by z608174 on 26/10/2016.
 */
public class PageObjectDesignPattern {
    private WebDriver driver;
    public PageObjectDesignPattern(WebDriver driver){
        this.driver = driver;
    }
    public PageObjectDesignPattern goToPageObjectDesignPatternPage(){
        driver.findElement(By.linkText("Page Object Design Pattern")).click();
        return this;
    }


}
