package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by arpan on 13/12/2016.
 */
public class HomePage {

    WebDriver driver;


    public HomePage(WebDriver ldriver) {
        this.driver = ldriver;
    }

    @FindBy(css = "a[class='link-account']")
    WebElement sign_in;

    @FindBy(css = "a[class='link-account']")
    WebElement register;

    @FindBy(css = "a[title='Wishlist']")
    WebElement wishList;

    @FindBy(xpath = "//a[@href='http://www.gharobar.com/marketplace/']")
    WebElement marketplace;


    public void clickOnSignInLink() {
        sign_in.click();
    }

    public void clickOnRegisterLink(){
        register.click();
    }

    public void clickOnWishlistLink(){
        wishList.click();
    }

    public void clickOnMarketplaceLink(){
        marketplace.click();
    }

    public String getHomePageTitle(){
        return driver.getTitle();
    }




}
