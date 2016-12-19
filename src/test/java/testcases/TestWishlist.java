package testcases;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Wishlist;

/**
 * Created by arpan on 16/12/2016.
 */
public class TestWishlist {

    WebDriver driver;
    Wishlist wish;


    @BeforeMethod
    public void setUp() {
        driver = BrowserFactory.getBrowser("firefox");
        driver.get(DataProviderFactory.getConfig().getApplicationURL());
    }


    @Test
    public void verifyWishlistLogin(){
        wish = PageFactory.initElements(driver, Wishlist.class);
        wish.wishlistverification(DataProviderFactory.getExcel().getData(0,21,0));
    }




    @AfterMethod
    public void tearDown() {
        BrowserFactory.closeBrowser(driver);
    }





}
