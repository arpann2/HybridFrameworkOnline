package testcases;


import factory.BrowserFactory;
import factory.DataProviderFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogIn;
import utility.Helper;

/**
 * Created by arpan on 16/12/2016.
 */
public class TestLogIn {

    WebDriver driver;
    LogIn login;

    @BeforeMethod
    public void setUp() {
        driver = BrowserFactory.getBrowser("firefox");
        driver.get(DataProviderFactory.getConfig().getApplicationURL());
    }


    @Test
    public void logIn() {

        LogIn login = PageFactory.initElements(driver, LogIn.class);
        login.logincheck(DataProviderFactory.getExcel().getData(0,21,0),DataProviderFactory.getExcel().getData(0,21,1));
        String actual = driver.getTitle();
        Assert.assertEquals(actual, "Customer Login");



    }


    @AfterMethod
    public void tearDown(ITestResult result) {
        Helper.captureScreenShots(driver, result.getMethod().getMethodName());
        BrowserFactory.closeBrowser(driver);
    }




}



