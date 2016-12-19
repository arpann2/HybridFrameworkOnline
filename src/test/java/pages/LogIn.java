package pages;

import dataProvider.ExcelDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by arpan on 16/12/2016.
 */
public class LogIn {

    WebDriver driver;


    @FindBy(css = "a[class='link-account']")
    WebElement account;

    @FindBy(css = "input[id='email'][class='input-text']")
    WebElement emailField;

    @FindBy(css = "input[id='pass'][title='Password']")
    WebElement passwordField;

    @FindBy (css = "button[id='send2']")
    WebElement clickLogin;


    public LogIn(WebDriver ldriver) {
        driver = ldriver;
    }



    public void logincheck(String email, String pword) {
        account.click();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.getMessage();
        }

        emailField.sendKeys(email);
        passwordField.sendKeys(pword);

        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.getMessage();
        }

        clickLogin.click();
    }






}
