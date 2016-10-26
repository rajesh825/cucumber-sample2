package org.cucumber.website.step;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.cucumber.website.pageojbects.Documentation;
import org.cucumber.website.pageojbects.PageObjectDesignPattern;
import org.cucumber.website.pageojbects.SeleniumHQ;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class SeleniumAdvancedDocumentationStepDefs {


    protected WebDriver driver;

    SeleniumHQ seleniumHQPage;
    Documentation documentationPage;
    PageObjectDesignPattern pageObjectDesignPatternPage;
    String actualPageTitle;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/mac64-chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        //driver.close();
        driver.quit();
    }

    @Given("^that seleniumhq\\.org is available$")
    public void that_seleniumhq_org_is_available() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        seleniumHQPage = new SeleniumHQ(driver);
    }



    @When("^I read the documentation about page objects$")
    public void I_read_the_documentation_about_page_objects() throws Throwable {
        //seleniumHQPage.goToDocumentationPage();
        Documentation documentationPage = seleniumHQPage.goToDocumentationPage();
        PageObjectDesignPattern pageObjectDesignPatternPage = documentationPage.goToPageObjectDesignPatternPage();
        //documentationPage = new Documentation(driver);
        //documentationPage.goToPageObjectDesignPatternPage();
        actualPageTitle = driver.getTitle();
    }

    @Then("^I should see the title \"([^\"]*)\" #Correct Title$")
    public void i_should_see_the_title_Correct_Title(String expectedTitle) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(expectedTitle, actualPageTitle);
    }


}




