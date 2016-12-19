package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by arpan on 16/12/2016.
 */
public class Helper {


    //Create seperate Helper class in Utility package.

    private static String todayDate() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("-dd-MMM-yyyy_hh-mm-ss");
        String fd =sdf.format(date);
        return fd;
    }


    // driver will be your Page Object class driver, use result object of ITestResult to get method name
    // in Page Obect class in AfterMethod annotation
    public static void captureScreenShots(WebDriver driver, String methodName) {

        TakesScreenshot ts = (TakesScreenshot) driver;
       File source =  ts.getScreenshotAs(OutputType.FILE);

       String dest = System.getProperty("user.dir")+"\\ScreenShots\\"+methodName+todayDate()+".jpeg";

       File destination = new File(dest);
        try {
            FileUtils.copyFile(source, destination);
        } catch (Exception e) {
            System.out.println("Screenshot didn't taken: " + e.getMessage());
        }


    }



}
