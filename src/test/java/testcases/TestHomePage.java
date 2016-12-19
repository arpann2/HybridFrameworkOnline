package testcases;

import dataProvider.ConfigDataProvider;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import javax.sql.rowset.BaseRowSet;

/**
 * Created by arpan on 15/12/2016.
 */
public class TestHomePage {

    WebDriver driver;
    HomePage home;

    @BeforeMethod
    public void setUp(){
        driver =BrowserFactory.getBrowser("firefox");
        driver.get(DataProviderFactory.getConfig().getApplicationURL());


    }

    @Test
    public void verifyTitle(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        String expected =  home.getHomePageTitle();

        Assert.assertEquals("Home page", expected);
    }

    @AfterMethod
    public void tearDown() {
        BrowserFactory.closeBrowser(driver);
    }





}
