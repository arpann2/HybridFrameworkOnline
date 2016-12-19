package factory;

import dataProvider.ConfigDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by arpan on 05/12/2016.
 */
public class BrowserFactory {

        static WebDriver driver;

    public static WebDriver  getBrowser(String browserName) {

        if(browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", DataProviderFactory.getConfig().firefoxPath());
            driver = new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", DataProviderFactory.getConfig().chromePath());
            driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", DataProviderFactory.getConfig().iePath());
            driver = new InternetExplorerDriver();

        }
        else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", DataProviderFactory.getConfig().edgePath());
            driver = new EdgeDriver();

        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;


    }

    public static void closeBrowser(WebDriver ldriver) {
        ldriver.quit();
    }



}
