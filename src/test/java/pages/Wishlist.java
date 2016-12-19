package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by arpan on 16/12/2016.
 */
public class Wishlist {

    WebDriver driver;

    @FindBy(css = ".link.wishlist")
    WebElement wishlistLink;

    @FindBy(xpath = ".//*[@id='newsletter']")
    WebElement newsLetterField;

    @FindBy (css = "input[id='pass']")
    WebElement  EnterPword;

    @FindBy(css = "#send2")
    WebElement loginButton;

    @FindBy(xpath = "//*[@class='action subscribe primary'] ")
    WebElement subscribeLink;

    public Wishlist(WebDriver ldriver) {
        this.driver = ldriver;
    }



    public void wishlistverification(String email){
        wishlistLink.click();

        newsLetterField.sendKeys(email);
        subscribeLink.click();
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.getMessage();
        }

    }







}
