package org.cucumber.website.pageojbects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by z608174 on 26/10/2016.
 */
public class Documentation {

    private WebDriver driver;

    public Documentation(WebDriver driver) {
        this.driver = driver;
    }
    /*public Documentation goToDocumentation(){
        driver.findElement(By.linkText("Documentation")).click();
        return this;
    }*/
    public PageObjectDesignPattern goToPageObjectDesignPatternPage(){
        driver.findElement(By.linkText("Page Object Design Pattern")).click();
        return new PageObjectDesignPattern(driver);
    }
}
